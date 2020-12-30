/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Bangphancong;
import model.LaiXe;
import model.Pair;
import model.Tuyen;

/**
 *
 * @author hoang
 */
public class ControllerImpl implements Controller{

    @Override
    public <T> void ghiFile(List<T> list, String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new    ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(ControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public <T> List<T> docFile(String fileName) {
        File file = new File(fileName);
        List<T> list = new ArrayList<>();
       if(file.length()>0){
            try {
            file.createNewFile();
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream oss = new    ObjectInputStream(fis);
                Object o = oss.readObject();
                list = (List<T>) o;
                oss.close();
                fis.close();
        } catch (IOException ex) {
            Logger.getLogger(ControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return list;
    }
   public boolean isAccept(List<Bangphancong> lsPC , LaiXe l , Pair<Tuyen,Integer> pair){
       for (Bangphancong b : lsPC) {
           if(b.getLaixe().getMaLX()== l.getMaLX()){
               return (b.getTongsoluot()+pair.getSoluot())<=15;
           }
       }
       return true;
   }
   public Bangphancong getBangphancong(LaiXe l ,List<Bangphancong> lsPC){
       for (Bangphancong b : lsPC) {
           if(b.getLaixe().getMaLX()== l.getMaLX()){
               return b;
           }
       }
       return null;
   }
   public void addOrUpdate(List<Bangphancong> lsPC , LaiXe l , Pair<Tuyen,Integer> pair){
       Bangphancong b = this.getBangphancong(l, lsPC);
       if(b==null){
           Bangphancong bpc =new Bangphancong(l, pair);
           lsPC.add(bpc);
       }else{
           boolean isExist =false;
           for (int i = 0; i < b.getLsPair().size(); i++) {
               Pair<Tuyen,Integer> p = b.getLsPair().get(i);
               if(p.getTuyen().getMaTuyen()==pair .getTuyen().getMaTuyen()){
                   isExist=true;
                   p.setSoluot(p.getSoluot()+pair.getSoluot());
                   break;
               }
               
           }
           if(isExist==false){
                b.getLsPair().add(pair);
           }
       }
   }
    @Override
    public <T> void sortByName(List<T> list) {
        list.sort(new Comparator<T>(){
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof Bangphancong){
                    Bangphancong b1 = (Bangphancong) o1;
                    Bangphancong b2 =(Bangphancong) o2;
                    String fullname1 = b1.getLaixe().getHoten().trim();
                    String fullname2 = b2.getLaixe().getHoten().trim();
                    String name1 = fullname1.substring(fullname1.lastIndexOf(" "));
                    String name2 = fullname2.substring(fullname2.lastIndexOf(" "));
                    
                    return name1.compareTo(name2);
                }
                return 0;
            }
            
    });
    }

    @Override
    public <T> void sortByTuyen(List<T> list) {
       list.sort(new Comparator<T>() {
           @Override
           public int compare(T o1, T o2) {
              if(o1 instanceof Bangphancong){
                  Bangphancong b1 = (Bangphancong) o1;
                  Bangphancong b2 =(Bangphancong) o2;
                  return b1.getLsPair().size() - b2.getLsPair().size();
              }
              return 0;
           }
       });
    }
}
