/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class ejercicio1 {
    private int [][] matriz;
    private Scanner Teclado;
    
    public  void CargarMatriz()
    {
        Teclado=new Scanner(System.in);
        matriz=new int[2][5];
        
        for(int f = 0; f < 2; f++){
           System.out.println("Carga de la matriz por columna:");
        for(int c=0;c<5;c++) {        
                System.out.print("Ingrese componente " + " de la fila " + f + " y la columna "+ c + " :");
                matriz[f][c]=Teclado.nextInt();
           }  
        }
    }
    
    public  void Imprimir(){
        
        for (int f =0; f < 3; f++){
            
            for (int c = 0; c < 5; c++){
                
                System.out.print(matriz[f][c] +" ");
            }
            System.out.println();
        }
    }
}
