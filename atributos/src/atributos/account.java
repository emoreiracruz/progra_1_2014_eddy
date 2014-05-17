/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributos;

/**
 *
 * @author Eddy
 */
public class account {
    
    private double saldoinicial;
    private boolean hayError;
    
    public account ()
    {
        saldoinicial=0;
        hayError=false;
    }
    
   /** este metodo sirve para aumentar la cuenta de un usuario
     * @param monto Parametro para recibir el nuevo monto
     */
  
    
    public void deposito(double monto)
    {
        setSaldoinicial(getSaldoinicial() + monto);
    }
    
    /*este metodo sirve para disminuir la cuenta de un usuario
     *@param monto parametro para recibir el nuevo monto
    */
    
    public void retiro(double monto)
    {
        if(getSaldoinicial()>=monto)
            setSaldoinicial(getSaldoinicial() - monto);
        else
            setHayError(true);
    }

    /**
     * @return the saldoinicial
     */
    public double getSaldoinicial() {
        return saldoinicial;
    }

    /**
     * @param saldoinicial the saldoinicial to set
     */
    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
}
