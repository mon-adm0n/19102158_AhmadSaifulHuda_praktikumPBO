/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan2.unguided;

/**
 *
 * @author m0n
 */
public class ClassObjek {
    String nama = "no name";
    String vision = "no vision";
    
    public ClassObjek(){}
        
    public ClassObjek(String nama){
        this.nama = nama;
    }
    
    public ClassObjek(String nama, String vision) {
        this.nama = nama;
        this.vision = vision;
    } 
    
    public String getNama() {
        return nama;
    }
    
    public String getVision() {
        return vision;
    }
    
}
