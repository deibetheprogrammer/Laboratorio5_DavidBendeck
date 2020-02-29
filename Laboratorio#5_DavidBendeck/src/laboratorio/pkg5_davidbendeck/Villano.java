/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg5_davidbendeck;

/**
 *
 * @author davidbendeck
 */
public class Villano extends Metahuman {
    
    private boolean carcel;
    private int muertesCausadas;

    public Villano() {
    }

    public Villano(boolean carcel, int muertesCausadas) {
        this.carcel = carcel;
        this.muertesCausadas = muertesCausadas;
    }

    public Villano(int muertesCausadas, String nombre, int edad, String palnetaOrigen, int altura) {
        super(nombre, edad, palnetaOrigen, altura);
        this.muertesCausadas = muertesCausadas;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public int getMuertesCausadas() {
        return muertesCausadas;
    }

    public void setMuertesCausadas(int muertesCausadas) {
        this.muertesCausadas = muertesCausadas;
    }

    @Override
    public String toString() {
        return "Villano{" + "carcel=" + carcel + ", muertesCausadas=" + muertesCausadas + '}';
    }
    
}
