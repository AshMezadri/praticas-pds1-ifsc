package lista2questao3;

public class Aluno extends Pessoa{

	private Long matricula;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.getNome() + " //CPF : " + this.getCpf() + " //Nascimento : " + this.getDataNasc() + " //Matricula : " + this.matricula ;
	}
	
}
