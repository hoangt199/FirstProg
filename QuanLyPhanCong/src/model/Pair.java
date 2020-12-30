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
public class Pair<K,V> implements Serializable{
    private K Tuyen;
    private V soluot;

    public Pair() {
    }

    public Pair(K Tuyen, V soluot) {
        this.Tuyen = Tuyen;
        this.soluot = soluot;
    }

    public K getTuyen() {
        return Tuyen;
    }

    public void setTuyen(K Tuyen) {
        this.Tuyen = Tuyen;
    }

    public V getSoluot() {
        return soluot;
    }

    public void setSoluot(V soluot) {
        this.soluot = soluot;
    }
    
}
