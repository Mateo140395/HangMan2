/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

import java.util.ArrayList;

/**
 * Clase que implementa métodos relativos á comprobación de fallos e acertos da
 * palabra
 *
 * @author Mateo
 */
public class HangMan {

    /**
     * Constante que almacena o máximo de fallos
     */
    public final static int MAX_FAILS = 6;
    //Nova instancia da clase Hiddenword
    private HiddenWord hiddenWord;
    //Array dinámico que almacenará os caracteres fallados
    private ArrayList<Character> fails;

    private ArrayList<Character> tried;

    /**
     * Constructor que recibe a palabra e a asigna na instancia de Hiddenword
     *
     * @param guessword
     */
    public HangMan(String guessword) {
        this.hiddenWord = new HiddenWord(guessword);
        this.fails = new ArrayList<>();
        this.tried = new ArrayList<>();
    }

    public ArrayList<Character> getTried() {
        return tried;
    }

    public void setTried(ArrayList<Character> tried) {
        this.tried = tried;
    }

    /**
     * Recuperamos a palabra oculta
     *
     * @return
     */
    public HiddenWord getHiddenWord() {
        return hiddenWord;
    }

    /**
     * Modificamos a palabra oculta
     *
     * @param hiddenWord
     */
    public void setHiddenWord(HiddenWord hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    /**
     * Recuperamos os fallos
     *
     * @return
     */
    public ArrayList<Character> getFails() {
        return fails;
    }

    /**
     * Método que devolve os fallos acumulados
     *
     * @return
     */
    public String getStringFails() {
        String stringfails = "";
        for (int i = 0; i < fails.size(); i++) {
            stringfails += fails.get(i) + " ";
        }
        return stringfails;
    }

    /**
     * Referencia a método doutra clase que devolve a palabra con guións no
     * lugar dos fallos
     *
     * @return
     */
    public String showHiddenWord() {
        return hiddenWord.show();
    }

    /**
     * Referencia a método doutra clase que devolve a palabra oculta completa
     *
     * @return
     */
    public String showFullWord() {
        return hiddenWord.showFullWord();
    }

    /**
     * Referencia a método doutra clase que comproba caracteres. Agora ademáis
     * engade os caracteres a comprobar nos fallos se procede
     *
     * @param c
     */
    public void tryChar(char c) {
        if (!hiddenWord.checkChar(c)) {
            fails.add(c);
        }
        tried.add(c);
    }

    /**
     * Comprobación da terminación da partida. Ben por palabra descuberta ou
     * fallos excedidos
     *
     * @return
     */
    public boolean isGameOver() {
        return maxFailsExceeded() || hiddenWord.isVisible();
    }

    /**
     * Comproba se se excedeu o límite de fallos
     *
     * @return
     */
    public boolean maxFailsExceeded() {
        return fails.size() == MAX_FAILS;
    }
}
