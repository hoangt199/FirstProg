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
public class LaiXe implements Serializable{
    private int maLX;
    private String hoten;
    private String diaChi;
    private String trinhdo;
    private static int lid = 100;

    public LaiXe() {
        this.maLX = lid++;
    }

    public LaiXe(String hoten, String diaChi, String trinhdo) {
        this.maLX = lid++;
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.trinhdo = trinhdo;
    }

    public int getMaLX() {
        return maLX;
    }

    public void setMaLX(int maLX) {
        this.maLX = maLX;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public static int getLid() {
        return lid;
    }

    public static void setLid(int lid) {
        LaiXe.lid = lid;
    }
    
    
}
