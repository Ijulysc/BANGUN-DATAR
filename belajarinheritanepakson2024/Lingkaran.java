/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarinheritanepakson2024;

/**
 *
 * @author user
 */
public class Lingkaran extends BangunDatar {
    float r;
    
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran : " +luas);
        return luas;
    }
    
    float keliling(){
        float keliling = (float)(2 * Math.PI * r * r);
        System.out.println("Keliling Lingkaran : " +keliling);
        return keliling;
    }
}
