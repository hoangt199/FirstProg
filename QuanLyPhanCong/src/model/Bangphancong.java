/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang
 */
public class Bangphancong implements Serializable{
    private LaiXe laixe;
    private List<Pair<Tuyen,Integer>> lsPair;
    private int tongsoluot;

    public Bangphancong() {
        lsPair=new ArrayList<>();
        tongsoluot=0;
    }

    public Bangphancong(LaiXe laixe,Pair<Tuyen ,Integer> pair) {
        this();
        this.laixe = laixe;
        this.lsPair.add(pair);
        this.tongsoluot = tongsoluot;
    }

    public LaiXe getLaixe() {
        return laixe;
    }

    public void setLaixe(LaiXe laixe) {
        this.laixe = laixe;
    }

    public List<Pair<Tuyen, Integer>> getLsPair() {
        return lsPair;
    }

    public void setLsPair(Pair<Tuyen,Integer> pair) {
        this.lsPair.add(pair);
    }

    public int getTongsoluot() {
        tongsoluot = 0;
        for (Pair<Tuyen, Integer> pair : lsPair) {
            tongsoluot+=pair.getSoluot();
        }
        return tongsoluot;
    }

    public void setTongsoluot(int tongsoluot) {
        this.tongsoluot = tongsoluot;
    }
    
    
}
