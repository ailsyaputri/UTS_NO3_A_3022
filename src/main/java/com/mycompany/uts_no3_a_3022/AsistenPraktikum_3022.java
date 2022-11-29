/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3022;

/**
 *
 * @author ASUS
 * Ailsya Putri / 21103022 / SI05A
 */
    public class AsistenPraktikum_3022 extends Mahasiswa_3022{
    String mkAsisten_3022;
    int jmlPertemuan_3022;
    
    public double totalPendapatan_3022(){
        return (jmlPertemuan_3022 * 50000);
    }
    
    public void tampilDataAsistenPraktikum_3022(){
        super.tampilDataMahasiswa_3022();
        System.out.println("MK Asistensi       : " + mkAsisten_3022);
        System.out.println("Jumlah Pertemuan   : " + jmlPertemuan_3022);
        System.out.println("Total Pendapatan   : " + totalPendapatan_3022());
    }    
}