import java.util.*;
import static java.lang.System.out;

public class Teste {
    private Agenda1 agenda = new Agenda1();
    private Nomes nomes ;
    private Scanner entrada = new Scanner(System.in);
    public Teste(Agenda a){
        agenda = a;
    }

    public void dialogar() {
        boolean sair = false;
        while (!sair) {
            out.println("\n MENU PRINCIPAL:");
            out.println("(1) Listar nomes");
            out.println("(2) Adicionar nome");
            out.println("(2) Adicionar nome");
            // outros metodos id etc
            out.println("(3) Sair");
            out.println("Escolha uma opção: ");
            String op = entrada.nextLine();
            switch(op) {
                case "1": agenda.listar(); break;
                case "2": agenda.adicionar(); break;
                case "3": sair = true; break;
                default: out.println("Opção inválida!");
            }
            out.println("Fim do programa!");
        }}
    }
