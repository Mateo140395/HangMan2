/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *Interfaz cun método abstracto para a xeración de palabras
 * @author Mateo
 */
public interface WordGenerator {
    /**
     * Método sen implementar para xerar as palabras
     * @return
     * @throws GenerateWordException 
     */
    public String generateWord() throws GenerateWordException;

}
