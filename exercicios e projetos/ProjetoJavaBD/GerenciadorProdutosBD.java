import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Essa Classe é Concreta onde o JDBC é usado para executar as consultas SQL:
// (obterProdutos(), inserirProduto(Produto produto), atualizarProduto(Produto produto), deletarProduto(int id))
// e interagir com o banco de dados 

public class GerenciadorProdutosBD implements GerenciadorProdutos {
    String url = "jdbc:postgresql://silly.db.elephantsql.com/tygpapxg";
    String user = "tygpapxg";
    String password = "Orns4UxgO0_i1NZ4DeD2tfvFBwB9LG4_";

    private Connection conn = null; // Adicione uma variável de instância para armazenar a conexão

    private Connection getConnection() {
        if (conn == null) { // Verifique se a conexão já foi estabelecida
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão estabelecida com sucesso");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    @Override
    public List<Produto> obterProdutos() {
        Connection conn = getConnection();
        List<Produto> produtos = new ArrayList<>();

        if (conn == null) {
            return produtos;
        }

        try {
            String sql = "SELECT * FROM produtos";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

            return produtos;

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void inserirProduto(Produto produto) {
        Connection conn = getConnection();

        if (conn == null) {
            return;
        }

        try {
            String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
            PreparedStatement stm = conn.prepareStatement(sql);

            stm.setString(1, produto.getNome());
            stm.setDouble(2, produto.getPreco());
            int rows = stm.executeUpdate();

            if (rows == 0) {
                System.out.println("Não adicionou");
            } else {
                System.out.println("Adicionado com sucesso");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Connection conn = getConnection();

        if (conn == null) {
            return;
        }

        try {
            String sql = "UPDATE produtos SET nome = ?, preco = ? WHERE id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);

            stm.setString(1, produto.getNome());
            stm.setDouble(2, produto.getPreco());
            stm.setInt(3, produto.getId());

            int rows = stm.executeUpdate();

            if (rows == 0) {
                System.out.println("Não atualizou nenhum registro.");
            } else {
                System.out.println("Produto atualizado com sucesso.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarProduto(int id) {
        Connection conn = getConnection();

        if (conn == null) {
            return;
        }

        try {
            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, id);

            int rows = stm.executeUpdate();

            if (rows == 0) {
                System.out.println("Não deletou nenhum registro.");
            } else {
                System.out.println("Produto deletado com sucesso.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
