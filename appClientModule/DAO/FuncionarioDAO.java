package DAO;
import VO.Funcionario;
import VO.Pessoa;

public class FuncionarioDAO extends PessoaDAO implements BaseDaoInterfaceDAO{
	private Funcionario vo;
	
	public FuncionarioDAO(Funcionario vo) {
		super((Pessoa)vo);
		this.vo = vo;
	}
	
	public void save() {
		
	}
	
	public void edit() {
		
	}
	
	public void find() {
		
	}
	
	public void delete() {
		
	}
	
}
