
public class Aluno {
	private String nome;
	private int id;
	
//<<<<<<< HEAD
	public Aluno(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}	
/*=======
	public Aluno(String nome, int id){
		nome = nome;
		id = id;

>>>>>>> branch 'master' of https://github.com/CamargoAndre/Aula00_UsoGiteGitHub.git
	}*/

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
