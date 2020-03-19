
public class Aluno {
	private String nome;
	private int id;
	
	public Aluno(String nome, int id){
		nome = nome;
		id = id;

	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}
	
	//Setters
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
}
