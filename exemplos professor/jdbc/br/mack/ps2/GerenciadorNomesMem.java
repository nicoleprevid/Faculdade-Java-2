package br.mack.ps2;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNomesMem implements GerenciadorNomes {
    List<String> nomes = new ArrayList<>();

    @Override
    public List<String> obterNomes() {
       return nomes;
    }

    @Override
    public void adicionarNome(String nome) {
        nomes.add(nome);
    }
    
}
