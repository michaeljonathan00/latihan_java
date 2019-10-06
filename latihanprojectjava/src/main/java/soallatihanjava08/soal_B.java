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
public class soal_B {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double disc ;
    double cost = 660000;
    double jml, bayar, total;
    
    System.out.print("Harga satuan Printer = 660000 \n");
    
    System.out.print("Jumlah Pembelian = ");
    jml = input.nextDouble();
    bayar = jml*cost;
    //Hitung Diskon 
    if (bayar > 15000000) {
        bayar = jml*cost;
        disc = bayar*0.15;
        total = bayar-disc;
        System.out.print("Diskon Yang Diterima = " + disc);
        System.out.print(" \n");
        System.out.print("Total Yang Dibayar = " + total);
    }
    else{
        System.out.print("Total Yang Dibayar = " + bayar);
        
    }
    
    }
    
    
}
