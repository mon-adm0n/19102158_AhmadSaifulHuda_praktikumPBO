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
public class ObjekMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassObjek arrayNama[] = new ClassObjek[3];
        
        ClassObjek nama1 = new ClassObjek();
        ClassObjek nama2 = new ClassObjek("Mon");
        ClassObjek nama3 = new ClassObjek("huda","haha");
        
        arrayNama[0] = nama1;
        arrayNama[1] = nama2;
        arrayNama[2] = nama3;
        
        System.out.println("== Daftar Nama Chara Cringe ==");
        
    for (ClassObjek i : arrayNama){
        System.out.println("Nama chara: " + i.getNama());
        System.out.println("Vision: " + i.getVision());
        System.out.println("");
        }
      
    }
   
}
