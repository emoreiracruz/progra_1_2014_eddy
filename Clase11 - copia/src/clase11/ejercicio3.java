/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase11;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class ejercicio3 {
     private int [][] matriz;
    private Scanner Teclado;
    
    public  void CargarMatriz()
    {
        Teclado=new Scanner(System.in);
        matriz=new int[3][4];
        
        for(int f = 0; f < 3; f++){
           for(int c = 0; c < 4; c++){
               System.out.println("Ingrese el numero correspondiente");
               matriz[f][c]=Teclado.nextInt();
           }
        }
    }
    
    public void PrimeraFila()
    {
    System.out.println("Primer fila de la matriz");
    for (int c = 0; c < 4; c++){
        System.out.println(matriz[0][c]);
    }
    } 
    
    public void UltimaFila()
    {
        System.out.println("Ultima Fila de la matriz");
        for (int c = 0; c < 4; c++){
        System.out.println(matriz[2][c]);
    }
}
    public void PrimerColumna()
    {
      System.out.println("Primer columna de la matriz");
        for (int f = 0; f < 3; f++){
        System.out.println(matriz[f][0]);   
    }
}
}
    