package lista2questao3;

public class Professor extends Pessoa {

	private Long siape;

	public Long getSiape() {
		return siape;
	}

	public void setSiape(Long siape) {
		this.siape = siape;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.getNome() + " //CPF : " + this.getCpf() + " //Nascimento : " + this.getDataNasc() + " //Siape : " + this.siape ;
	}
}
