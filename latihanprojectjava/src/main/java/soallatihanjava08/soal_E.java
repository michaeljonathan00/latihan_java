/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soallatihanjava08;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class soal_E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int tujuan, total ;
        int upah_a = 2500;
        int upah_b = 4000;
        int jrk_a = 169;
        int jrk_b = 452;
        
        // Tampilkan Daftar Tujuan
        System.out.print("Kota tujuan \n");
        System.out.print("1. Surabaya \n");
        System.out.print("2. Bandung \n");
        // Input Pilihan Tujuan
        System.out.print ("Kota tujuan = ");
        tujuan = input.nextInt();
        // Tampilkan Ongkos Kirim
        switch (tujuan){
        case 1 : System.out.print ("Kota tujuan = Surabaya \n");
                 System.out.print("Jarak Malang-Surabaya = 169km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 2500 \n");
                 total = jrk_a*upah_a;
                 System.out.print("Total Biaya Kirim Ke Surabaya = " + total);
                 break;
        case 2 : System.out.print ("Kota Tujuan = Bandung \n");
                 System.out.print("Jarak Malang-Bandung = 452km \n");
                 System.out.print("Ongkos Kirim Per Km = Rp. 4000 \n");
                 total = jrk_b*upah_b;
                 System.out.print("Total Biaya Kirim Ke Bandung = " + total);
                 break;
                 
        }
    }
        
        
        
   
    }
    