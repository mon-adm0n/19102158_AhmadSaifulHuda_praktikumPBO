/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan1.unguided;

/**
 *
 * @author m0n
 */
public class loading {
    public static void main(String[] args) {
        System.out.println("===== Loading =====");
        for (int i = 0; i <= 101; i++){
            if (i > 100){
                System.out.println("Loading complete!");
            }else {
                System.out.println("Loading " +i+ "%");
            }
        }
    }
    
}
