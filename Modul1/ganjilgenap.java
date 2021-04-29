/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan1.unguided;

import java.util.Scanner;

/**
 *
 * @author m0n
 */
public class ganjilgenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Program Ganjil Genap ====");

        System.out.println("Masukan bilangan bulat:");
        int bil = input.nextInt();

        if (bil % 2 == 1) {
            System.out.println(bil + " adalah bilangan ganjil");
        } else {
            System.out.println(bil + " adalah bilangan genap");
        }
    }

}
