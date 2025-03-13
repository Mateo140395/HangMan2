/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangman.ui;

import hangman.model.HangMan;
import ui.ArrayWordGenerator;
import hangman.ui.GenerateWordException;
import hangman.ui.KeyboardWordGenerator;
import hangman.ui.WordGenerator;
import java.util.Scanner;

/**
 * A clase xerará os menús e levará a cabo o xogo
 *
 * @author Mateo
 */
public class MenuGenerator {

    //Instancia da clase Hangman
    private HangMan hangMan;

    /**
     * O método principal chamará aos demáis métodos para levar a cabo o xogo
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();
        try {
            do {
                menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
                menuGenerator.showGameMenu();
            } while (!menuGenerator.showExitMenu());

        } catch (GenerateWordException e) {
            if (e.isVisible()) {
                System.out.println("Erro ao xerar a palabra: " + e.getMessage());
            }
        }
    }

    /**
     * Polo momento o método so chama ao método generateWord doutra clase.
     *
     * @return
     */
    private String showInitMenu() throws GenerateWordException {
        WordGenerator wordGenerator = null;
        int option=0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Benvido. Escolla o modo de xogo:");
            System.out.println("1. Un xogador");
            System.out.println("2. Dous xogadores");
            option = scan.nextInt();

            if (option == 1) {
                wordGenerator = new ArrayWordGenerator();
            } else if (option == 2) {
                wordGenerator = new KeyboardWordGenerator();
            } else {
                System.out.println("Erro. Escolla un dos modos de xogo.");
            }
        } while (option != 1 && option != 2);

        return wordGenerator.generateWord();
    }

    /**
     * O método pide as letras ao usuario e mostra se acertou ou fallou
     */
    private void showGameMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palabra preparada. Comezamos a partida.");
        //Pedimos as letras a probar
        while (!hangMan.isGameOver()) {
            System.out.println("Palabra a adiviñar: "+hangMan.getHiddenWord().show());
            System.out.println("Letras falladas: "+hangMan.getStringFails());
            
            System.out.println("Qué letra desexa comprobar?");
            char character = scan.nextLine().charAt(0);
            hangMan.tryChar(character);
            //Se falla imos ensinando a lista de fallos e se acerta a palabra con guións nas letras aínda non descubertas

        } 
        //Se acerta informamos ao usuario e se queda sen intentos mostramos cal era a palabra
        if (hangMan.maxFailsExceeded()) {
            System.out.println("Número de intentos superado. A palabra era: " + hangMan.showFullWord());
        } else {
            System.out.println("Palabra adiviñada!!! Noraboa!!!");
        }
    }

    /**
     * Preguntamos se quere saír ou volver a xogar
     *
     * @return
     */
    private boolean showExitMenu() {
        char answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Desexa saír da aplicación? S/N:");
        do {
            answer = scan.next().charAt(0);

            if (answer == 's' || answer == 'S') {
                System.out.println("Ata a próxima!!");
                return true;
            } else if (answer == 'n' || answer == 'N') {
                return false;
            } else {
                System.out.println("Resposta non válida. Prema S para saír ou N para volver a xogar.");
            }

        } while (answer != 's' || answer != 'S' || answer != 'n' || answer != 'N');
        return false;
    }

}
