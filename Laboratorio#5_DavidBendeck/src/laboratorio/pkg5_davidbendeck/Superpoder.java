/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg5_davidbendeck;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

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
        if (powerLevel > 0 && powerLevel < 11)
            this.powerLevel = powerLevel;
        else {
            JOptionPane.showMessageDialog(null, "Nivel de poder invalido, default: 5");
            this.powerLevel = 5;
        }
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        if (powerLevel > 0 && powerLevel < 11)
            this.powerLevel = powerLevel;
        else {
            JOptionPane.showMessageDialog(null, "Nivel de poder invalido, default: 5");
            this.powerLevel = 5;
        }
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
        return descripcion;
    }
    
    
}
