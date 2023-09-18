import java.util.*;
import static java.lang.System.out;

public class Teste {
    private Agenda1 agenda = new Agenda1();
    public Teste(Agenda a){
        agenda = a;
    }

    public void dialogar() {
        boolean sair = false;
        while (!sair) {
            out.println("\n MENU PRINCIPAL:");
            out.println("(1) Listar nomes");
            out.println("(2) Adicionar nome");
            // outros metodos id etc
            out.println("(3) Sair");
            out.println("Escolha uma opção: ");
            String op = entrada.nextLine();
            switch(op) {
                case "1": agenda.listar(); break;
                case "2": 
                // pergunta nome
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("me diga o nome q deseja adicionar")
                String nomeRecebido = scanner1.nextLine();
                // pergunta id
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("me diga o id q deseja adicionar")
                String idRecebido = scanner2.nextLine();
                agenda.adicionar(nomeRecebido, idRecebido); 
                break;
                case "3": sair = true; break;
                default: out.println("Opção inválida!");
            }
            out.println("Fim do programa!");
        }}
    }
