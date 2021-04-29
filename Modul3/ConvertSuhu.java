/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huda.praktikumpbo.pertemuan3;

/**
 *
 * @author huda
 */
public class ConvertSuhu {
    //typeData
    private double celcius, fahrenheit, kelvin, reamur, suhuAwal;

    //Constructor
    public ConvertSuhu(double suhuAwal){
        this.suhuAwal = suhuAwal;
    }
    
    //Definisi method
    public double getSuhuAwal() {
        return this.suhuAwal;
    }
    
    
    //method
    void Celcius(double suhuAwal){
        reamur = ((4*suhuAwal)/5);
        fahrenheit = ((9*suhuAwal)/5)+32;
        kelvin = suhuAwal+273.15;
        System.out.println("Suhu dalam Reamur\t : "+ reamur + "°R");
        System.out.println("Suhu dalam Fahrenheit\t : "+fahrenheit+ "°F");
        System.out.println("Suhu dalam Kelvin\t : "+ kelvin + "°K");
        System.out.println("");
    }
    
    void Fahrenheit(double suhuAwal){
        celcius = ((suhuAwal-32)*5)/9;
        reamur = ((suhuAwal-32)*4)/9;
        kelvin = (((suhuAwal-32)*5)/9)+273.15;
        System.out.println("Suhu dalam Celcius\t : "+celcius + "°C");
        System.out.println("Suhu dalam Reamur\t : "+ reamur + "°R");
        System.out.println("Suhu dalam Kelvin\t : "+ kelvin + "°K");
        System.out.println("");
    }
    
    void Reamur(double suhuAwal){
        celcius = (5*suhuAwal)/4;
        fahrenheit = ((9*suhuAwal)/4) + 32;
        kelvin = ((5*suhuAwal)/4)+273.15;
        System.out.println("Suhu dalam Celcius\t : "+celcius + "°C");
        System.out.println("Suhu dalam Fahrenheit\t : "+fahrenheit + "°F");
        System.out.println("Suhu dalam Kelvin\t : "+ kelvin + "°K");
        System.out.println("");
    }
    
    void Kelvin(double suhuAwal){
        celcius = suhuAwal - 273.15;
        reamur = ((suhuAwal - 273.15) * 4)/5;
        fahrenheit = (((suhuAwal - 273.15) * 9)/5) + 32;
        System.out.println("Suhu dalam Celcius\t : "+celcius+ "°C");
        System.out.println("Suhu dalam Fahrenheit\t : "+fahrenheit + "°F");
        System.out.println("Suhu dalam Reamur\t : "+ reamur + "°R");
        System.out.println("");
    }
}

