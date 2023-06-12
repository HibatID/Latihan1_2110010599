/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author TUF GAMING FX506II
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika hibat = new Matematika(9,9);
        System.out.println("Hasil Penjumlahan : " + hibat.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + hibat.setPengurangan());
        System.out.println("Hasil Perkalian : " + hibat.setPerkalian());
        System.out.println("Hasil Pembagian : " + hibat.setPembagian());
    }
}
