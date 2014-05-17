/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;

/**
 *
 * @author emoreira
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * ciclo for
         * 
         */
        
        int cantidad;
        int suma=0; 
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digite el # de impresiones que desea ver");
        cantidad=Integer.parseInt(teclado.nextLine());
        System.out.println("\n");
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
            
        }
        System.out.print("\n");
        System.out.println("Inverso");
        System.out.print("\n");
        for (int i = cantidad-1; i>= 0; i--) {
            System.out.println(i);
            
        }
    }
    
    
    
}
