/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import hangman.model.HangMan;
import hangman.ui.GenerateWordException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ui.GUIKeyboardWordgenerator;

/**
 *
 * @author mateo.alfayafontan
 */
public class MainWindow extends javax.swing.JFrame {

    private HangMan hangMan;
    private ArrayList<JLabel> hangManLabels;

    public HangMan getHangMan() {
        return hangMan;
    }

    public void setHangMan(HangMan hangMan) {
        this.hangMan = hangMan;
    }

    public ArrayList<JLabel> getHangManLabels() {
        return hangManLabels;
    }

    public void setHangManLabels(ArrayList<JLabel> hangManLabels) {
        this.hangManLabels = hangManLabels;
    }

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        setTitle("O aforcado");
        initComponents();
        this.hangManLabels = new ArrayList();
        hangManLabels.add(firstLabel);
        hangManLabels.add(oneFailLabel);
        hangManLabels.add(twoFailsLabel);
        hangManLabels.add(threeFailsLabel);
        hangManLabels.add(fourFailsLabel);
        hangManLabels.add(fiveFailsLabel);
        hangManLabels.add(sixFailsLabel);
        tryCharText.setEnabled(false);
        tryButton.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bottomPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        topPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        hiddenWordLabel = new javax.swing.JLabel();
        failsLabel = new javax.swing.JLabel();
        tryCharLabel = new javax.swing.JLabel();
        tryButton = new javax.swing.JButton();
        showFailsLabel = new javax.swing.JLabel();
        showHiddenWordLabel = new javax.swing.JLabel();
        tryCharText = new javax.swing.JTextField();
        rightPanel = new javax.swing.JPanel();
        firstLabel = new javax.swing.JLabel();
        oneFailLabel = new javax.swing.JLabel();
        twoFailsLabel = new javax.swing.JLabel();
        threeFailsLabel = new javax.swing.JLabel();
        fourFailsLabel = new javax.swing.JLabel();
        fiveFailsLabel = new javax.swing.JLabel();
        sixFailsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        bottomPanel.setBackground(new java.awt.Color(153, 153, 153));

        newGameButton.setBackground(new java.awt.Color(255, 255, 255));
        newGameButton.setForeground(new java.awt.Color(0, 0, 0));
        newGameButton.setText("Nova partida");
        newGameButton.setMaximumSize(new java.awt.Dimension(100, 30));
        newGameButton.setPreferredSize(new java.awt.Dimension(120, 30));
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        bottomPanel.add(newGameButton);

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("Saír");
        exitButton.setMaximumSize(new java.awt.Dimension(100, 100));
        exitButton.setPreferredSize(new java.awt.Dimension(80, 30));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        bottomPanel.add(exitButton);

        getContentPane().add(bottomPanel, java.awt.BorderLayout.SOUTH);

        topPanel.setBackground(new java.awt.Color(153, 153, 153));

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("O xogo do aforcado");
        topPanel.add(titleLabel);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        leftPanel.setBackground(new java.awt.Color(153, 153, 153));
        leftPanel.setLayout(new java.awt.GridBagLayout());

        hiddenWordLabel.setForeground(new java.awt.Color(0, 0, 0));
        hiddenWordLabel.setText("Palabra a adiviñar:");
        hiddenWordLabel.setPreferredSize(new java.awt.Dimension(135, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        leftPanel.add(hiddenWordLabel, gridBagConstraints);

        failsLabel.setForeground(new java.awt.Color(0, 0, 0));
        failsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        failsLabel.setText("Letras falladas:");
        failsLabel.setPreferredSize(new java.awt.Dimension(135, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        leftPanel.add(failsLabel, gridBagConstraints);

        tryCharLabel.setForeground(new java.awt.Color(0, 0, 0));
        tryCharLabel.setText("Introduce unha letra:");
        tryCharLabel.setPreferredSize(new java.awt.Dimension(135, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        leftPanel.add(tryCharLabel, gridBagConstraints);

        tryButton.setBackground(new java.awt.Color(255, 255, 255));
        tryButton.setForeground(new java.awt.Color(0, 0, 0));
        tryButton.setText("Probar");
        tryButton.setOpaque(false);
        tryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        leftPanel.add(tryButton, gridBagConstraints);

        showFailsLabel.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        leftPanel.add(showFailsLabel, gridBagConstraints);

        showHiddenWordLabel.setForeground(new java.awt.Color(0, 0, 0));
        showHiddenWordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        leftPanel.add(showHiddenWordLabel, new java.awt.GridBagConstraints());

        tryCharText.setBackground(new java.awt.Color(255, 255, 255));
        tryCharText.setForeground(new java.awt.Color(0, 0, 0));
        tryCharText.setMinimumSize(new java.awt.Dimension(60, 23));
        tryCharText.setPreferredSize(new java.awt.Dimension(60, 23));
        tryCharText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tryCharTextKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        leftPanel.add(tryCharText, gridBagConstraints);

        getContentPane().add(leftPanel, java.awt.BorderLayout.CENTER);

        rightPanel.setBackground(new java.awt.Color(153, 153, 153));
        rightPanel.setLayout(new java.awt.CardLayout());

        firstLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-0.png")); // NOI18N
        rightPanel.add(firstLabel, "card2");

        oneFailLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-1.png")); // NOI18N
        rightPanel.add(oneFailLabel, "card3");

        twoFailsLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-2.png")); // NOI18N
        rightPanel.add(twoFailsLabel, "card4");

        threeFailsLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-3.png")); // NOI18N
        rightPanel.add(threeFailsLabel, "card5");

        fourFailsLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-4.png")); // NOI18N
        rightPanel.add(fourFailsLabel, "card6");

        fiveFailsLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-5.png")); // NOI18N
        rightPanel.add(fiveFailsLabel, "card7");

        sixFailsLabel.setIcon(new javax.swing.ImageIcon("/home/mateo.alfayafontan/NetBeansProjects/HangMan/Images/Hangman-6.png")); // NOI18N
        rightPanel.add(sixFailsLabel, "card8");

        getContentPane().add(rightPanel, java.awt.BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        // TODO add your handling code here:
        startNewGame();

    }//GEN-LAST:event_newGameButtonActionPerformed

    private void tryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryButtonActionPerformed
        // TODO add your handling code here:
        if (!hangMan.isGameOver()) {
            tryChar();
        }
    }//GEN-LAST:event_tryButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void tryCharTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tryCharTextKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == evt.VK_ENTER) {
            tryButton.doClick();
        }
    }//GEN-LAST:event_tryCharTextKeyTyped

    private void startNewGame() {
        String[] option = new String[]{
            "Un xogador, xerando a palabra ao azar",
            "Dous xogadores, un xera a palabra e o outro adiviña"
        };

        String selectedMode = (String) JOptionPane.showInputDialog(bottomPanel, "Seleccione un modo de xogo", "Modo de xogo", HEIGHT, null, option, option[0]);
        if (option != null) {
            try {
                if (selectedMode.equals(option[0])) {

                    ArrayWordGenerator wordGenerator = new ArrayWordGenerator();
                    hangMan = new HangMan(wordGenerator.generateWord());

                    initialStatus();

                } else {
                    GUIKeyboardWordgenerator kWordGenerator = new GUIKeyboardWordgenerator();
                    hangMan = new HangMan(kWordGenerator.generateWord());

                    initialStatus();
                }
            } catch (GenerateWordException e) {
                JOptionPane.showMessageDialog(this, "Erro ao xerar a palabra: " + e.getMessage());
            }
        }

    }

    private void showGameStatus() {
        showHiddenWordLabel.setText(hangMan.getHiddenWord().show());
        showFailsLabel.setText(hangMan.getStringFails());

        switch (hangMan.getFails().size()) {
            case 1:
                oneFailLabel.setVisible(true);
                break;
            case 2:
                twoFailsLabel.setVisible(true);
                break;
            case 3:
                threeFailsLabel.setVisible(true);
                break;
            case 4:
                fourFailsLabel.setVisible(true);
                break;
            case 5:
                fiveFailsLabel.setVisible(true);
                break;
            case 6:
                sixFailsLabel.setVisible(true);
                break;
        }
        if (hangMan.isGameOver()) {
            if (hangMan.maxFailsExceeded()) {
                JOptionPane.showMessageDialog(bottomPanel, "Perdeches. A palabra era: " + hangMan.showFullWord());
            } else {
                JOptionPane.showMessageDialog(bottomPanel, "Gañaches. A palabra era: " + hangMan.showFullWord());
            }
            tryCharText.setEnabled(false);
            tryButton.setEnabled(false);
        }
    }

    private void tryChar() {
        if (tryCharText.getText().matches("[a-z]+")) {
            int maxChars = tryCharText.getText().length();

            if (maxChars >= 1) {
                if (hangMan.getTried().contains(tryCharText.getText().charAt(0))) {
                    JOptionPane.showMessageDialog(bottomPanel, "O caracter '" + tryCharText.getText().charAt(0) + "' xa foi introducido");
                } else {
                    hangMan.tryChar(tryCharText.getText().charAt(0));
                }
            }
            tryCharText.requestFocus();
            showGameStatus();
        } else {
            JOptionPane.showMessageDialog(bottomPanel, "Debe ecribir polo menos un caracter. A palabra so contén letras entre a e z en minúscula");
        }
        tryCharText.setText("");
    }

    private void initialStatus() {
        hangMan.getFails().clear();
        hangMan.getTried().clear();

        for (int i = 1; i < hangManLabels.size(); i++) {
            hangManLabels.get(i).setVisible(false);
        }

        showGameStatus();
        tryCharText.setEnabled(true);
        tryButton.setEnabled(true);
        tryCharText.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel failsLabel;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel fiveFailsLabel;
    private javax.swing.JLabel fourFailsLabel;
    private javax.swing.JLabel hiddenWordLabel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel oneFailLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel showFailsLabel;
    private javax.swing.JLabel showHiddenWordLabel;
    private javax.swing.JLabel sixFailsLabel;
    private javax.swing.JLabel threeFailsLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton tryButton;
    private javax.swing.JLabel tryCharLabel;
    private javax.swing.JTextField tryCharText;
    private javax.swing.JLabel twoFailsLabel;
    // End of variables declaration//GEN-END:variables
}
