package br.mack.ps2;

import java.util.List;

public interface GerenciadorNomes {
    List<String> obterNomes();
    void adicionarNome(String nome);
}


// DAO -> GerenciadorNomes
// Cliente -> IHM
// Implementação -> GerenciadorNomesMem
// Entidade -> String