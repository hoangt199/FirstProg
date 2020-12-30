/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public interface Controller {
    <T> void ghiFile(List<T> list,String fileName);
    <T> List <T> docFile(String fileName);
    <T> void sortByName (List<T> list );
    <T> void sortByTuyen(List<T> list);
}
