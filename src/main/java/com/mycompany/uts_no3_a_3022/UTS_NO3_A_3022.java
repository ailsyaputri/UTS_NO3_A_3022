/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_a_3022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 * Ailsya Putri / 21103022 / SI05A
 */
public class UTS_NO3_A_3022 {

    public static void main(String[] args) {
        AsistenPraktikum_3022[] A = new AsistenPraktikum_3022[1];
        StudentStaff_3022[] S = new StudentStaff_3022[1];
        A[0] = new AsistenPraktikum_3022() {};
        S[0] = new StudentStaff_3022();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data mahasiswa
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                A[i].nim_3022 = br.readLine();
                System.out.print("Nama             : ");
                A[i].nama_3022 = br.readLine();
                System.out.print("Jurusan          : ");
                A[i].jurusan_3022 =br.readLine();
                System.out.print("IPK              : ");
                A[i].ipk_3022 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                A[i].mkAsisten_3022 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                A[i].jmlPertemuan_3022 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("=== DATA ASISTEN PRAKTIKUM ===");
            for(AsistenPraktikum_3022 AP : A){
                AP.tampilDataAsistenPraktikum_3022();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                S[i].nim_3022 = br.readLine();
                System.out.print("Nama        : ");
                S[i].nama_3022 = br.readLine();
                System.out.print("Jurusan     : ");
                S[i].jurusan_3022 =br.readLine();
                System.out.print("IPK         : ");
                S[i].ipk_3022 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                S[i].unitKerja_3022 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                S[i].jamKerja_3022 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("=== DATA STUDENT STAFF ===");
            for(StudentStaff_3022 SS : S){
                SS.tampilDataStudentStaff_3022();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}