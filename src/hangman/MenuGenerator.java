/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangman;

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

        do {
            menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
            menuGenerator.showGameMenu();
        } while (!menuGenerator.showExitMenu());
    }

    /**
     * Polo momento o método so chama ao método generateWord doutra clase.
     *
     * @return
     */
    private String showInitMenu() {
        ArrayWordGenerator wordgenerator = new ArrayWordGenerator();
        try{
        return wordgenerator.generateWord();
        }catch(GenerateWordException e){
            System.out.println("Erro");
        }
        return null;
    }

    /**
     * O método pide as letras ao usuario e mostra se acertou ou fallou
     */
    private void showGameMenu() {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        System.out.println("Benvido. Escolla o modo de xogo:");
        System.out.println("1. Un xogador");
        System.out.println("2. Dous xogadores");
        try {
            switch (option) {
                case 1:
                    ArrayWordGenerator wordgenerator = new ArrayWordGenerator();
                    wordgenerator.generateWord();
                    System.out.println("Palabra preparada. Comezamos a partida.");
                    //Pedimos as letras a probar
                    do {
                        System.out.println("Qué letra desexa comprobar?");
                        char character = scan.next().charAt(0);
                        hangMan.tryChar(character);
                        //Se falla imos ensinando a lista de fallos e se acerta a palabra con guións nas letras aínda non descubertas
                        if (hangMan.getFails().contains(character)) {
                            System.out.println("Incorrecto! A letra non forma parte da palabra.");
                            System.out.println("Lista de fallos: " + hangMan.getStringFails());
                        } else {
                            System.out.println("Correcto! A letra forma parte da palabra.");
                            System.out.println(hangMan.showHiddenWord());

                        }
                    } while (!hangMan.isGameOver());
                    //Se acerta informamos ao usuario e se queda sen intentos mostramos cal era a palabra
                    if (hangMan.maxFailsExceeded()) {
                        System.out.println("Número de intentos superado. A palabra era: " + hangMan.showFullWord());
                    } else {
                        System.out.println("Palabra adiviñada!!! Noraboa!!!");
                    }
                    break;
                case 2:
                    KeyboardWordGenerator kwordgenerator = new KeyboardWordGenerator();
                    kwordgenerator.generateWord();
                    System.out.println("Palabra preparada. Comezamos a partida.");
                    //Pedimos as letras a probar
                    do {
                        System.out.println("Qué letra desexa comprobar?");
                        char character = scan.next().charAt(0);
                        hangMan.tryChar(character);
                        //Se falla imos ensinando a lista de fallos e se acerta a palabra con guións nas letras aínda non descubertas
                        if (hangMan.getFails().contains(character)) {
                            System.out.println("Incorrecto! A letra non forma parte da palabra.");
                            System.out.println("Lista de fallos: " + hangMan.getStringFails());
                        } else {
                            System.out.println("Correcto! A letra forma parte da palabra.");
                            System.out.println(hangMan.showHiddenWord());

                        }
                    } while (!hangMan.isGameOver());
                    //Se acerta informamos ao usuario e se queda sen intentos mostramos cal era a palabra
                    if (hangMan.maxFailsExceeded()) {
                        System.out.println("Número de intentos superado. A palabra era: " + hangMan.showFullWord());
                    } else {
                        System.out.println("Palabra adiviñada!!! Noraboa!!!");
                    }
                    break;
                default:
                    System.out.println("Erro. Escolla unha das dúas opcións");
            }
        } catch (GenerateWordException e) {
            if (e.visible){
                System.out.println("Erro.");
            }
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
                System.out.println("Resposta non válida. Prema s para saír ou n para volver a xogar.");
            }

        } while (answer != 's' && answer != 'n');
        return false;
    }

}
