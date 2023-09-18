import java.util.*;
import static java.lang.System.out;

public class Nomes {
    
    private void Nome(){}

    private void listar(){
    List<String> nomes = agenda.obterNomes();
    System.out.println("\n >> Lista dos nomes:");
    for (String nome: nomes) { out.println(nome); }
    }

    private void adicionar(){
    System.out.println("\n>> Digite o novo nome: ");
    String novoNome = entrada.nextLine();
    agenda.adicionarNome(novoNome);
    }
}