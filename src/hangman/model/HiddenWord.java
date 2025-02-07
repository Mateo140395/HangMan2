/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman.model;

import java.util.Arrays;

/**
 *Clase que implementa diversos métodos para as funcionalidades relativas á palabra(comprobar letras, ensinar a palabra...)
 * @author Mateo
 */
public class HiddenWord {
    //Array de caracteres que compoñen a palabra
    private char[] characters;
    //Atributo que acumula os acertos
    private boolean[] hits;

    /**
     * Constructor da palabra. Recibe a palabra e convertea nun conxunto de caracteres
     * @param guessword 
     */
    public HiddenWord(String guessword) {
        this.characters = guessword.toCharArray();
        this.hits= new boolean[characters.length];
        
       Arrays.fill(hits, false);
    }
    /**
     * Recuperamos os caracteres
     * @return 
     */
    public char[] getCharacters() {
        return characters;
    }
    
    /**
     * Modificamos os caracteres
     * @param characters 
     */
    public void setCharacters(char[] characters) {
        this.characters = characters;
    }
    
    /**
     * Recuperamos os acertos
     * @return 
     */
    public boolean[] getHits() {
        return hits;
    }

    /**
     * Modificamos os acertos
     * @param hits 
     */
    public void setHits(boolean[] hits) {
        this.hits = hits;
    }
    
    /**
     * Método que comproba se o caracter está na palabra
     * @param c
     * @return 
     */
    public boolean checkChar(char c){
        for(int i=0; i<characters.length;i++){
            if(c==characters[i]){
                hits[i]=true;
                return true;
            }
            
        }
        return false;
    }
    /**
     * Ensina a palabra cos caracteres descubertos e guións en lugar dos non descubertos
     * @return 
     */
    public String show(){
        String result="";
        for (int i=0; i<characters.length;i++){
            if(hits[i]){
                result+=characters[i];
            }else{
                result+="-";
            }
        }
        return result;
    }
    
    /**
     * Ensina a palabra completa
     * @return 
     */
    public String showFullWord(){
        String fullword="";
        for(int i=0; i<characters.length;i++){
        fullword+=characters[i];
        }
        return fullword;
    }
    
    /**
     * Método que se asegura de se a palabra foi descuberta
     * @return 
     */
    public boolean isVisible() {
        for (int i = 0; i < characters.length; i++) {
            if (!hits[i]) {
                return false;
            }
        }
        return true;
    }
    
}
