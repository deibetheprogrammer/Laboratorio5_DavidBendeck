/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg5_davidbendeck;

import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Metahuman {
    
    protected ArrayList<Superpoder> superpoderes = new ArrayList<>();
    protected String nombre;
    protected int edad;
    protected String palnetaOrigen;
    protected int altura;

    public Metahuman() {
    }

    public Metahuman(String nombre, int edad, String palnetaOrigen, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.palnetaOrigen = palnetaOrigen;
        this.altura = altura;
    }

    public ArrayList<Superpoder> getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(ArrayList<Superpoder> superpoderes) {
        this.superpoderes = superpoderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPalnetaOrigen() {
        return palnetaOrigen;
    }

    public void setPalnetaOrigen(String palnetaOrigen) {
        this.palnetaOrigen = palnetaOrigen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Metahuman{" + "superpoderes=" + superpoderes + ", nombre=" + nombre + ", edad=" + edad + ", palnetaOrigen=" + palnetaOrigen + ", altura=" + altura + '}';
    }
    
}
