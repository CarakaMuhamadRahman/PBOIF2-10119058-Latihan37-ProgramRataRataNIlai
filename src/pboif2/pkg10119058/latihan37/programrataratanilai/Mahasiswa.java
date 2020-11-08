/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program :Program ini berisi program untuk menghitung rata-rata nilai.
 */
public class Mahasiswa {
    private Scanner scanner = new Scanner(System.in);
    private int i, jumlahMhs;
    private float jumlah, nilaiMhs, ratarata;
    
     private int inputJumlahMahasiswa() {
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scanner.nextInt();
        return jumlahMhs;
    }
    
    public double hitungRataRata() {
        inputJumlahMahasiswa();
        jumlah = 0;
        i=1;
        while (i <= jumlahMhs){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilaiMhs = scanner.nextFloat ();
                jumlah += nilaiMhs;
                i++;
        }
        ratarata = jumlah / jumlahMhs;
        return ratarata;
    }
}
