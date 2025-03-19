/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *Clase para o manexo de excepcións
 * @author Mateo
 */
public class GenerateWordException extends Exception {
    //Atributo que usaremos para saber se hai que facer visible a excepcion
    protected boolean visible;
    /**
     * Recibimos o valor de visible
     */
    public boolean isVisible() {
        return visible;
    }
    /**
     * Modificamos o valor de visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = visible;
    }

}
