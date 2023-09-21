import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar um produto para inserção
        Produto produtoParaInserir = new Produto();
        produtoParaInserir.setNome("Borracha");
        produtoParaInserir.setPreco(1.50);

        // Inicializar o gerenciador de produtos (usando GerenciadorProdutosBD neste exemplo)
        GerenciadorProdutos gerenciador = new GerenciadorProdutosBD();

        // Inserir o produto
        gerenciador.inserirProduto(produtoParaInserir);
        System.out.println("Produto inserido com sucesso.");

        // Obter a lista de produtos
        List<Produto> produtos = gerenciador.obterProdutos();

        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }

        // Atualizar um produto
        Produto produtoParaAtualizar = new Produto();
        produtoParaAtualizar.setId(1); // Defina o ID do produto que deseja atualizar
        produtoParaAtualizar.setNome("Novo Nome");
        produtoParaAtualizar.setPreco(29.99);
        gerenciador.atualizarProduto(produtoParaAtualizar);
        System.out.println("Produto atualizado com sucesso.");

        // Deletar um produto
        int idProdutoParaDeletar = 2; // Defina o ID do produto que deseja deletar
        gerenciador.deletarProduto(idProdutoParaDeletar);
        System.out.println("Produto deletado com sucesso.");
    }
}
