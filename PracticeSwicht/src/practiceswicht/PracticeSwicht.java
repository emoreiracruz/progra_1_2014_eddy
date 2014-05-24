/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practiceswicht;

import java.util.Scanner;

/**
 *
 * @author Eddy
 */
public class PracticeSwicht {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero=0;
        String mes=" "; 
        boolean validar=true;
        char continuar;
        
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1 ();
        
        do
        {
            System.out.println("Digite un numero entre 1 y 12 ");
            
            numero=Integer.parseInt(teclado.nextLine());
            mes= oEjercicio1.Mes(numero);
             System.out.println(mes);
             
                    
                    
                    
                    
                    
                    System.out.println("Desea continuar con otra operacion S/N ");
            continuar=teclado.nextLine() .charAt (0);
            if ((continuar=='S')||(continuar=='s'))
            {
                validar=true;
            }
            if ((continuar=='N')||(continuar=='n'))
                validar=false;
        }while (validar);
}
}