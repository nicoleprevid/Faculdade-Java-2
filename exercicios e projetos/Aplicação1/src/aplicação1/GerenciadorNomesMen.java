
package aplicação1;


import java.util.*;
public class GerenciadorNomesMen implements GerenciadorNomes{
    private List<String> nomes = new ArrayList<String>();

    @Override
    public List<String> obterNomes(){
        return nomes;
    }
    @Override
    public void  adicionarNome(String nome){
        nomes.add(nome);
    }

}