import java.util.List;

public interface GerenciadorProdutos {
    List<Produto> obterProdutos();
    void inserirProduto(Produto produto);
    void atualizarProduto(Produto produto);
    void deletarProduto(int id);
}
