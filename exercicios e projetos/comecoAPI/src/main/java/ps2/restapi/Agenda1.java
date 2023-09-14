
import java.util.*;
public class Agenda1 implements Agenda{
    private List<Nome> nomes = new ArrayList<String>();
    Nome nome = new Nome();
    
    
    public List<Nome> obterNomes(){
        return nomes;
    }
    
    public void  adicionarNome( String nome, long id){
        nomes.add(Nome);
    }
		
	public Agenda() {
	}

	public long getId(String nome) {
		return nome.id;
	}
	public void setId(String nome, long id) {
		this.id = nome.id;
	}
	public String getNome(long id) {
		return nome.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

