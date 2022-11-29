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
public class StudentStaff_3022 extends Mahasiswa_3022 {
    int unitKerja_3022, jamKerja_3022;
    double pendapatanStaff_3022;
    
    public double totalPendapatan_3022(){
        return (jamKerja_3022 * 30000);
    }
    
    public void tampilDataStudentStaff_3022(){
        super.tampilDataMahasiswa_3022();
        System.out.println("Unit Kerja         : " + unitKerja_3022);
        System.out.println("Jam Kerjs          : " + jamKerja_3022);
        System.out.println("Total Pendapatan   : " + totalPendapatan_3022());
    }    
}