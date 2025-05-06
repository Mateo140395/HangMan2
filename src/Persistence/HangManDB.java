/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mateo
 */
public class HangManDB {

    public static void createTable() {
        try {
            // Obtemos unha conexión coa base de datos
            Connection c = DriverManager.getConnection("jdbc:sqlite:data/words.db");
            String sql = """
                    CREATE TABLE IF NOT EXISTS word (
                         word VARCHAR(255) PRIMARY KEY
                    );
                    """;
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer");
            e.printStackTrace();
        }
    }

    public static void insertWords() {

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:data/words.db");

            try (PreparedStatement pstmt = c.prepareStatement("INSERT INTO word(word) VALUES(?)")) {
                pstmt.setString(1, "pinchar");
                pstmt.setString(2, "raqueta");
                pstmt.setString(3, "pescozo");
                pstmt.setString(4, "paz");
                pstmt.setString(5, "corral");
                pstmt.setString(6, "madurar");
                pstmt.setString(7, "besta");
                pstmt.setString(8, "criticar");
                pstmt.setString(9, "correr");
                pstmt.setString(10, "pesado");
                pstmt.executeUpdate();
            }
        } catch (SQLException ex) {

        }
    }
}
