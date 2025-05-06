/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Persistence.HangManDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.sql.ResultSet;

/**
 *
 * @author Mateo
 */
public class DBWordGenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {
        Connection c = null;
        Statement stmt = null;
        ResultSet rst = null;
        String selectedWord = "";

        try {

            HangManDB.createTable();
            HangManDB.insertWords();

            c = DriverManager.getConnection("jdbc:sqlite:data/words.db");

            stmt = c.createStatement();
            rst = stmt.executeQuery("SELECT COUNT(*) AS total FROM word");
                                    
            int total = rst.getInt("total");

            Random random = new Random();
            int index = random.nextInt(total);
            rst.close();

            rst = stmt.executeQuery("SELECT word FROM word");
            for (int i = 0; i <= index; i++) {
                rst.next();
            }

            selectedWord = rst.getString("word");

            rst.close();
            stmt.close();
            
        } catch (SQLException ex) {
            throw new GenerateWordException("Erro no acceso á base de datos: " + ex.getMessage(), true);
        }
        
        return selectedWord;
    }

}
