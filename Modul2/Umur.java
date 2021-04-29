/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan2.unguided;

import java.util.Scanner;

/**
 *
 * @author m0n
 */
public class Umur {
    public static void Umur() {
        int tahun;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun Lahir: ");
        tahun = input.nextInt();
        
        int umur = 2021 - tahun;
        System.out.println("Umur kamu adalah: "+ umur+ " Tahun"); 
    }
    public static void main(String[] args) {
        Umur();
    }
}
