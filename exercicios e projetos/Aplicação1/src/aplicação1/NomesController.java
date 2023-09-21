/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação1;

import java.sql.*;
import java.util.*;

public class NomesController implements GerenciadorNomes {

    final String url = "jdbc:postgresql://jelani.db.elephantsql.com/ihgbjicl";
    final String user = "ihgbjicl";
    final String pass = "9yyCXOJvMUMcZdWBoAOGU0BnmRK3E2q3";

    @Override
    public void adicionarNome(String nome) {

        try {
            //class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO nomes VALUES(?)");

            stmt.setString(1, nome);

            int rows = stmt.executeUpdate();
            System.out.println("Número de linhas modificadas: " + rows);
            conn.close();
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Deu ruim ao inserir");
        }
    }

    @Override
    public List<String> obterNomes() {
        String query = "SELECT * FROM nomes";
        List<String> nomes = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = conn.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                nomes.add(nome);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nomes;
    }}
