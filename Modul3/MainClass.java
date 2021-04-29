/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan3;

import java.util.Scanner;

/**
 *
 * @author huda
 */
public class MainClass {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        //typeData
        float suhuAwal;
        
        boolean keepLooping = true;
        do {
            System.out.println("-------------------------");
            System.out.println("|\tMenu Utama\t| ");
            System.out.println("-------------------------");
            System.out.println("| 1) Celcius\t\t|");
            System.out.println("| 2) Fahrenheit\t\t|");
            System.out.println("| 3) Reamur\t\t|");
            System.out.println("| 4) Kelvin\t\t|");
            System.out.println("| 5) Exit\t\t|");
            System.out.println("-------------------------");
            System.out.println("Masukan suhu yang ingin anda konversi: ");
            
            int menu = input.nextInt();
            System.out.println();

            switch (menu) {
                case 1 -> {
                    //konversi dari suhu Celcius
                    System.out.println("Masukkan suhu dalam Celcius : ");
                    suhuAwal = input.nextFloat();
                    ConvertSuhu c = new ConvertSuhu(suhuAwal);
                    System.out.println("Suhu Awal\t: " + c.getSuhuAwal()+"°C");
                    c.Celcius(suhuAwal);
               }
                case 2 -> {
                    //konversi dari suhu Fahrenheit
                    System.out.println("Masukkan suhu dalam Fahrenheit: ");
                    suhuAwal = input.nextFloat();
                    ConvertSuhu f = new ConvertSuhu(suhuAwal);
                    System.out.println("Suhu Awal\t: " + f.getSuhuAwal() + "°F");
                    f.Fahrenheit(suhuAwal);
               }
                case 3 -> {
                    //konversi dari suhu Reamur
                    System.out.println("Masukkan suhu dalam Reamur: ");
                    suhuAwal = input.nextFloat();
                    ConvertSuhu r = new ConvertSuhu(suhuAwal);
                    System.out.println("Suhu Awal\t: " + r.getSuhuAwal() + "°R");
                    r.Reamur(suhuAwal);
               }
                case 4 -> {
                    //konversi dari suhu Kelvin
                    System.out.println("Masukkan suhu dalam Kelvin: ");
                    suhuAwal = input.nextFloat();
                    ConvertSuhu k = new ConvertSuhu(suhuAwal);
                    System.out.println("Suhu Awal\t: " + k.getSuhuAwal() + "°K");
                    k.Kelvin(suhuAwal);
               }
                case 5 -> {
                    //exit program
                    System.out.println("Telah keluar dari program");
                    keepLooping = false;
               }
                default -> {
                    // jika user menginput tidak sesuai pada menu
                    System.out.println("Menu yang anda masukan salah!");
                    System.out.println();
               }
            }
        }while (keepLooping);
    }
}
