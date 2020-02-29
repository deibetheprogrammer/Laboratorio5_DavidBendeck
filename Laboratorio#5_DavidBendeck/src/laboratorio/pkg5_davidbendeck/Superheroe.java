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
public class Superheroe  extends Metahuman {
    
    private int villanosAtrapados;

    public Superheroe() {
    }

    public Superheroe(int villanosAtrapados) {
        this.villanosAtrapados = villanosAtrapados;
    }

    public Superheroe(String nombre, int edad, String palnetaOrigen, int altura) {
        super(nombre, edad, palnetaOrigen, altura);
        this.villanosAtrapados = 0;
    }

    public int getVillanosAtrapados() {
        return villanosAtrapados;
    }

    public void setVillanosAtrapados(int villanosAtrapados) {
        this.villanosAtrapados = villanosAtrapados;
    }

    @Override
    public String toString() {
        return "Superheroe{" + "villanosAtrapados=" + villanosAtrapados + '}';
    }
    
}
