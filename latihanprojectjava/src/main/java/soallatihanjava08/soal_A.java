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
public class soal_A {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int cost = 660000;
    int jml ;
    int total ;
    
    System.out.print ("Harga satuan Printer = 660.000\n");
    
    System.out.print (" Jumlah Barang = ");
    jml = input.nextInt();
    total = cost*jml;
   
    System.out.print("Total Bayar = " + total);
    
}
}
