
public class Main {
    public static void main (String[] args){
        GerenciadorNomes gNomes = new GerenciadorNomesMen();
        Ihm ihm = new Ihm(gNomes);
        ihm.dialogar();
    }
}