/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaordenamiento;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Punto {

    private double x;

    private double y;

    public Punto (double x , double y) {

        this.x = x;

        this.y = y;
}

    public Punto () {
      Random Aleatorio = new Random ();
        double r;

        r = Aleatorio.nextDouble();

        this.x = r;

        r = Aleatorio.nextDouble();

        this.y = r;
}

    public double getX () {

        return x;
}

    public double getY () {

        return y;
}

     double distancia ( ) {

        return ( Math . sqrt ((this. x -  getX ()) * (this. x -  getX ())

                + (this.y -  getY ()) * (this.y -  getY ())));
}


    

   
    }



