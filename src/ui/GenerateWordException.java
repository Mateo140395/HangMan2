/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.ui;

/**
 *
 * @author Mateo
 */
public class GenerateWordException extends Exception {

    protected boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public GenerateWordException(String message, boolean visible) {
        super(message);
        this.visible = visible;
    }

}
