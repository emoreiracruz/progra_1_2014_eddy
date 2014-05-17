/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributos;

import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Atributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean validar=true;
        int opcion;
        char continuar;
        double monto;
        
        
        account oaccount=new account();
        Scanner teclado= new Scanner(System.in);
        
        while(validar)
        {
            System.out.println("Digite 1 si quiere realizar un deposito y 2 si quiere realizar un retiro");
            opcion=Integer.parseInt(teclado.nextLine());
            
            if(opcion==1)
            {
                System.out.println("Digite el monto a depositar");
                monto=Double.parseDouble(teclado.nextLine());
                oaccount.deposito(monto);
            }
            
            if(opcion==2)
            {
                System.out.println("Digite el monto a retirar");
                 monto=Double.parseDouble(teclado.nextLine());
                oaccount.retiro(monto);
                if(oaccount.isHayError())
                {
                    System.out.println("El monto que usted va a retirar no puede ser retirado");
                }
            }
            System.out.println("El saldo final es de "+oaccount.getSaldoinicial());
            System.out.println("Desea continuar con otra transacción S/N ");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='S')||(continuar==('s')))
                    {
                        validar=true;
                    }
                    if((continuar=='N')||(continuar=='n'))
                        validar=false;
        }
        
        
        
    }
    
}
