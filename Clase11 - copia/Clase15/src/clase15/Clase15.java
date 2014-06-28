/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase15;

/**
 *
 * @author Estudiante
 */
public class Clase15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int[] arreglo={56,4,85,85,42};
        int[] arregloOrdenado;
        OrdenamientoSeleccion os=new OrdenamientoSeleccion();
        arregloOrdenado=os.OrdenS(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++){
            System.out.println(arregloOrdenado[i]);
          */  
        int[] arreglo={7,15,9,26,27,30};
        int[] arregloOrdenado;
        OrdenamientoBurbuja os=new OrdenamientoBurbuja();
        arregloOrdenado=os.OrdenamientoB(arreglo, "A");
        for (int i = 0; i < arregloOrdenado.length; i++){
            System.out.println(arregloOrdenado[i]);
        }
    }
    
}
