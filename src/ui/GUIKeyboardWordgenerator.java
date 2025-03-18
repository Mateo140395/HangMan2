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
 *
 * @author Mateo
 */
public class GUIKeyboardWordgenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Introduce unha palabra: ");
        JPasswordField passwordField = new JPasswordField(10);

        panel.add(label);
        panel.add(passwordField);

        int option = JOptionPane.showConfirmDialog(null, panel, "Palabra secreta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        panel.setLayout(new FlowLayout());

        panel.setVisible(true);

        if (option != JOptionPane.OK_OPTION) {
            throw new GenerateWordException("Cancelado polo usuario", false);
        }

        char[] passwordChars = passwordField.getPassword();
        String guessword = new String(passwordChars);

        if (!isValid(guessword)) {
            JOptionPane.showMessageDialog(passwordField, "Debe ecribir polo menos un caracter. A palabra so pode conter letras entre a e z en minúscula");
            return generateWord();
        }
        return guessword;
    }

    private boolean isValid(String word) {
        if (!word.matches("[a-z]+")) {
            return false;
        }
        return true;
    }
}
