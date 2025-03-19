/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.ui;

/**
 *Clase para xerar a palabra en modo de dous xogadores
 * @author Mateo
 */
public class KeyboardWordGenerator implements WordGenerator {

    /**
     * Pide unha palabra por consola sen mostrala
     * @return
     * @throws GenerateWordException 
     */
    @Override
    public String generateWord() throws GenerateWordException {

        System.out.println("Introduza a palabra a adiviñar polo outro xogador: ");
        String word = new String(System.console().readPassword());
        return word;
    }

}
