/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] sueldos= new double[5];
        int cantidadtrabajadores= 1;
        double sueldo=0;
       /* 
        Scanner teclado= new Scanner(System.in);
        
        do{
            System.out.println("Digite el sueldo del trabajador #"+cantidadtrabajadores);
            
            sueldo=teclado.nextDouble();
            
            sueldos[cantidadtrabajadores-1]=sueldo;
            
            cantidadtrabajadores++;
            
    }while (cantidadtrabajadores<6);
    
    for (int i = 0; i < sueldos.length; i++) {
        System.out.println("El sueldo del trabajador #"+ i+ 1 +" es de " + sueldos[i]);
    }*/
        int cantidadPersonas=0;
        float alturaPersona=0;
        ejercicio2 oejercicio2=new ejercicio2();
        do{
            System.out.println("Digite la altura de la persona #"+cantidadPersonas);
            
            alturaPersona=teclado.nextFloat();
            oejercicio2.AgregarAltura(alturaPersona);
            cantidad=personas++;
        }
            
        }
    }
    

