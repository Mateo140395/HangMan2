/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

/**
 *
 * @author Mateo
 */
public class KeyboardWordGenerator implements WordGenerator{

    @Override
    public String generateWord() throws GenerateWordException {
        System.out.println("Introduza a palabra a adiviñar polo outro xogador: ");
        System.console().readPassword();
        return null;
    }
    
}
