/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarinheritanepakson2024;

/**
 *
 * @author user
 */
public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    
    float luas(){
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga : " +luas);
        return luas;
    }
}
