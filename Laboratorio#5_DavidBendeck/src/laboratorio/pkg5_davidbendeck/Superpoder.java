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
public class Superpoder {
    
    private int powerLevel;
    private String descripcion;
    private boolean mortal;

    public Superpoder() {
    }

    public Superpoder(int powerLevel, String descripcion, boolean mortal) {
        this.powerLevel = powerLevel;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return "Superpoder{" + "powerLevel=" + powerLevel + ", descripcion=" + descripcion + ", mortal=" + mortal + '}';
    }
    
    
}
