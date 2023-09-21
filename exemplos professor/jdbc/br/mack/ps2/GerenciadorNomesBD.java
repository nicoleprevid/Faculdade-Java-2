package br.mack.ps2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesBD implements GerenciadorNomes {
    String url = "jdbc:postgresql://tuffi.db.elephantsql.com/lblnxdba";
    String user = "lblnxdba";
    String password = "ObsfK6DfIgrkWkQI-zvwK4sDjVJVqoI0";

    private Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        } 
    }

    @Override
    public List<String> obterNomes() {
        Connection conn = getConnection();
        List<String> nomes = new ArrayList<>();

        if(conn == null) {
            return nomes;
        }

        try {
            String sql = "select * from nomes";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                String nome = rs.getString("nome");
                nomes.add(nome);
            }

            return nomes;

        }catch(Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        
    }
    @Override
    public void adicionarNome(String nome) {
        Connection conn = getConnection();

        if(conn == null) {
            return;
        }

        try {
            String sql = "insert into nomes values(?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            
            stm.setString(1, nome);
            int rows = stm.executeUpdate();

            if(rows == 0) {
                System.out.println("Não adicionou");
            } else {
                System.out.println("Adicionado com sucesso");
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }


}
