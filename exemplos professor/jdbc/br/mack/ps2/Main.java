package br.mack.ps2;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Forma (1)
        // int opc = 1;
        // GerenciadorNomes gerenciador;
        // 
        // if(opc == 1) {
        //     gerenciador = new GerenciadorNomesBD();
        // } else {
        //     gerenciador = new GerenciadorNomesMem();
        // }

        // Forma (2)
        // leitura de um arquivo
        String classe = "br.mack.ps2.GerenciadorNomesMem"; // arquivo
        GerenciadorNomes gerenciador = (GerenciadorNomes) Class.forName(classe).newInstance();
         

        // IHM
        gerenciador.adicionarNome("Paulo");
        gerenciador.adicionarNome("Camila");

        List<String> todosOsNomes = gerenciador.obterNomes();
        for(String nome : todosOsNomes) {
            System.out.println(nome);
        }
    }
}