package controle;

import java.util.ArrayList;

import modelo.Funcionarios;

public class FuncionarioDAO {

	private static ArrayList<Funcionarios> listaFuncionarios;
	
	public static FuncionarioDAO getInstancia() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public FuncionarioDAO() {
		listaFuncionarios = new ArrayList<>();
	}
	
	public boolean inserir(Funcionarios func) {
		listaFuncionarios.add(func);
		return false;
	}
	
	public ArrayList<Funcionarios> listar(){
		return listaFuncionarios;
	}

	
}
