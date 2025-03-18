/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import hangman.ui.GenerateWordException;
import hangman.ui.WordGenerator;
import java.util.Random;

/**
 * A clase xera unha palabra aleatoria para o xogo
 *
 * @author Mateo
 */
public class ArrayWordGenerator implements WordGenerator {

    /**
     * Constante que almacena a lista de palabras posibles
     */
    private final static String[] WORDLIST
            = {
                "pinchar", "raqueta", "pescozo", "paz", "corral",
                "madurar", "besta", "criticar", "correr", "pesado"
            };

    /**
     * O metodo escolle unha palabra aleatoria da lista
     *
     * @return
     */
    @Override
    public String generateWord() throws GenerateWordException{
        Random random = new Random();
        //Creamos unha variable índice para a selección aleatoria da palabra
        int index = random.nextInt(WORDLIST.length);
        return WORDLIST[index];
    }
}
