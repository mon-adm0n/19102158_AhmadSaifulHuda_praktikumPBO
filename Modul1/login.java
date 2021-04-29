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
public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username = "admin";
        String password = "admin";

        System.out.println("==== Silakan Login ====");
        for (int i = 1; i <=3; i++) {
            System.out.println("");
            System.out.println("Username :");
            String user = input.nextLine();
            System.out.println("Password :");
            String passwd = input.nextLine();

                if (user.equals(username) && passwd.equals(password)) {
                    System.out.println("Login successful!");
                    break;
                    
                }else {
                    if (i == 3){
                        System.out.println("Login failed! ("+i+"/3)");
                        System.out.println("You have been blocked!");
                        
                    }else {
                        System.out.println("Login failed! ("+i+"/3)");
                    }
                }
        }
    }
    
}
