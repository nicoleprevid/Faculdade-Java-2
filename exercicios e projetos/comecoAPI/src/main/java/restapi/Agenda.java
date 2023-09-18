import java.util.List;

public interface Agenda{
    int MAX_CARACTERES_NOMES = 20;

    List<Nome> obterNomes();

    void adicionarNome(String nome, long id);

    
}