/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author hoang
 */
public class Tuyen implements Serializable{
    private int maTuyen;
    private int khoangcach;
    private int sodiemdung;
    private static int tid = 10000;

    public Tuyen() {
        this.maTuyen = tid++;
    }

    public Tuyen(int khoangcach, int sodiemdung) {
        this.maTuyen = tid++;
        this.khoangcach = khoangcach;
        this.sodiemdung = sodiemdung;
    }

    public int getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        this.maTuyen = maTuyen;
    }

    public int getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(int khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getSodiemdung() {
        return sodiemdung;
    }

    public void setSodiemdung(int sodiemdung) {
        this.sodiemdung = sodiemdung;
    }

    public static int getTid() {
        return tid;
    }

    public static void setTid(int tid) {
        Tuyen.tid = tid;
    }
    
    
}
