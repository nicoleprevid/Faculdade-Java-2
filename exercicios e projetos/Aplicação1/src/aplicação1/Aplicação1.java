
package aplicação1;

public class Aplicação1 {
    public static void main (String[] args){
        GerenciadorNomes gNomes = new NomesController();
        Ihm ihm = new Ihm(gNomes);
        ihm.dialogar();
    }
}