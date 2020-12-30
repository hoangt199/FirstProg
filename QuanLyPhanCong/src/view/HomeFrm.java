/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bangphancong;
import model.LaiXe;
import model.Pair;
import model.Tuyen;

/**
 *
 * @author hoang
 */
public class HomeFrm extends javax.swing.JFrame implements View{

    /**
     * Creates new form HomeFrm
     */
    private List<LaiXe> lsLX;
    private DefaultTableModel modelLX;
    private List<Tuyen> lsTuyen;
    private DefaultTableModel modelTuyen;
    private List<Bangphancong> lsPc;
    private DefaultTableModel modelPC;
    private ControllerImpl control;
    private int selectedIndex;
    public HomeFrm() {
        initComponents();
        lsLX = new ArrayList<>();
        lsTuyen =new ArrayList<>();
        lsPc=new ArrayList<>();
        modelLX=(DefaultTableModel) tblLX.getModel();
        modelTuyen=(DefaultTableModel) tblTuyen.getModel();
        modelPC=(DefaultTableModel) tblPC.getModel();
        control = new ControllerImpl();
    }
    public void addLX(LaiXe l){
        modelLX.setRowCount(0);
        lsLX.add(l);
        control.ghiFile(lsLX,"LAIXE.DAT");
        this.showData(lsLX, modelLX);
    }
     public void addTuyen(Tuyen t){
        lsTuyen.add(t);
        control.ghiFile(lsTuyen,"TUYEN.DAT");
        this.showData(lsTuyen,modelTuyen);
    }
     public boolean addPC(LaiXe l,Pair < Tuyen,Integer>pair){
         boolean accept = control.isAccept(lsPc, l, pair);
         if(accept == false){
             return false;
         }
         control.addOrUpdate(lsPc, l, pair);
         control.ghiFile(lsPc, "PHANCONG.DAT");
         this.showData(lsPc, modelPC);
         return true;
     }
    /**
     * This method is called  from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLX = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTuyen = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPC = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        combosort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma LX", "Ho ten", "Dia chi", "Trinh do"
            }
        ));
        jScrollPane1.setViewportView(tblLX);

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Huy bo");

        jButton3.setText("Hien thi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setText("Xoa");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Sua.setText("Sua");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(Sua)
                        .addGap(67, 67, 67)
                        .addComponent(jButton10)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(jButton3)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton10)
                    .addComponent(Sua))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("LaiXe", jPanel1);

        tblTuyen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Tuyen", "Khoang cach", "So diem dung"
            }
        ));
        jScrollPane2.setViewportView(tblTuyen);

        jButton4.setText("Them");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Huy bo");

        jButton6.setText("Hien thi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton4)
                        .addGap(96, 96, 96)
                        .addComponent(jButton5)
                        .addGap(85, 85, 85)
                        .addComponent(jButton6)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Tuyen xe", jPanel2);

        tblPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma LX", "Ho ten", "Ma tuyen", "So luot", "Tong so luot", "Tong so tuyen"
            }
        ));
        jScrollPane3.setViewportView(tblPC);

        jButton7.setText("Them");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Huy bo");

        jButton9.setText("Hien thi");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sap xep:");

        combosort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sap xep theo ten lai xe", "Sap xep theo so luong tuyen" }));
        combosort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButton7))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButton8)
                                .addGap(40, 40, 40)
                                .addComponent(jButton9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(combosort, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combosort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Bang phan cong", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new addLXFrm(this, rootPaneCheckingEnabled).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showLX();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       showTuyen();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new addPCFrm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new addTuyenFrm(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void combosortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosortActionPerformed
        int index = combosort.getSelectedIndex();
        if(index == 0){
            control.sortByName(lsPc);
        }else if(index == 1){
            control.sortByTuyen(lsPc);
        }
        this.showData(lsPc, modelPC);
    }//GEN-LAST:event_combosortActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        lsPc = control.docFile("PHANCONG.DAT");
        showData(lsPc,modelPC);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       int index = tblLX.getSelectedRow();
        for (LaiXe laiXe : lsLX) {
            lsLX.remove(index);
            modelLX.removeRow(index);
            showData(lsLX, modelLX);
            control.ghiFile(lsLX, "LAIXE.DAT");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
        selectedIndex = tblLX.getSelectedRow();
        SuaFrm sua = new SuaFrm(this, true);
        sua.setEdit(lsLX.get(selectedIndex));
        setVisible(true);
    }//GEN-LAST:event_SuaActionPerformed
    public void EditStudent(LaiXe l) {
        lsLX.remove(selectedIndex);
        this.addLX(l);
    }
    public List<LaiXe> getLsLX() {
        return lsLX;
    }

    public List<Tuyen> getLsTuyen() {
        return lsTuyen;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    @Override
    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if(t instanceof LaiXe){
                LaiXe l = (LaiXe) t;    
                model.addRow(new Object[]{
                    l.getMaLX(),
                    l.getHoten(),
                    l.getDiaChi(),
                    l.getTrinhdo()
                });
            }
            if(t instanceof Tuyen){
                Tuyen tu = (Tuyen) t;
                model.addRow(new Object[]{
                    tu.getMaTuyen(),
                    tu.getKhoangcach(),
                    tu.getSodiemdung()
                });
            }
            if(t instanceof Bangphancong){
                Bangphancong b = (Bangphancong) t;
                for (Pair<Tuyen,Integer> pair : b.getLsPair()) {
                    model.addRow(new Object[]{
                        b.getLaixe().getMaLX(),
                        b.getLaixe().getHoten(),
                        pair.getTuyen().getMaTuyen(),
                        pair.getSoluot(),
                        b.getTongsoluot(),
                        b.getLsPair().size()
                    });
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sua;
    private javax.swing.JComboBox<String> combosort;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLX;
    private javax.swing.JTable tblPC;
    private javax.swing.JTable tblTuyen;
    // End of variables declaration//GEN-END:variables

    private void showLX() {
        lsLX =control.docFile("LAIXE.DAT");
        int lid = lsLX.get(lsLX.size()-1).getMaLX();
        if(lsLX.size()>0){
            LaiXe.setLid(lid);
        }
        this.showData(lsLX, modelLX);
    }
     private void showTuyen() {
        lsTuyen =control.docFile("TUYEN.DAT");
        int lid = lsTuyen.get(lsTuyen.size()-1).getMaTuyen();
        if(lsTuyen.size()>0){
            Tuyen.setTid(lid);
        }
        this.showData(lsTuyen, modelTuyen);
    }
     private void showPC(){
         lsPc =control.docFile("PHANCONG.DAT");
         this.showData(lsPc,modelPC);
     }

    
}