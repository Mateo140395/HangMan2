/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import hangman.ui.GenerateWordException;
import hangman.ui.WordGenerator;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *Modo de xogo para dous xogadores con interfaz gráfica
 * @author Mateo
 */
public class GUIKeyboardWordgenerator implements WordGenerator {

    /**
     * Implementación do método abstracto da interfaz
     * @return
     * @throws GenerateWordException 
     */
    @Override
    public String generateWord() throws GenerateWordException {
        //Creamos o panel cos seus elementos e engadímolos
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Introduce unha palabra: ");
        JPasswordField passwordField = new JPasswordField(10);

        panel.add(label);
        panel.add(passwordField);
        
        //Cando entramos na opción de dous xogadores xerase un cadro de diálogo que pide a palabra secreta
        int option = JOptionPane.showConfirmDialog(null, panel, "Palabra secreta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        panel.setLayout(new FlowLayout());

        panel.setVisible(true);

        //Se non se lle da a aceptar lanza unha excepción invisible para o usuario
        if (option != JOptionPane.OK_OPTION) {
            throw new GenerateWordException("Cancelado polo usuario", false);
        }
        
        //Creamos un array de chars que serán os que formen a palabra a adiviñar
        char[] passwordChars = passwordField.getPassword();
        String guessword = new String(passwordChars);

        //Se a palabra é válida devólvea para iniciar o xogo
        if (!isValid(guessword)) {
            JOptionPane.showMessageDialog(passwordField, "Debe ecribir polo menos un caracter. A palabra so pode conter letras entre a e z en minúscula");
            return generateWord();
        }
        return guessword;
    }

    //Método que se asegura de que a palaba conteña só caracteres entre a e z
    private boolean isValid(String word) {
        if (!word.matches("[a-z]+")) {
            return false;
        }
        return true;
    }
}
