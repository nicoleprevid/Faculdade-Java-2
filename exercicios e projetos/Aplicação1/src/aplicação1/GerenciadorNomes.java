
package aplicação1;

/**
 *
 * @author 32323816
 */
import java.util.List;

public interface GerenciadorNomes {
    int MAX_CARACTERES_NOMES = 20;

    List<String> obterNomes();

    void adicionarNome(String nome);
}
    
