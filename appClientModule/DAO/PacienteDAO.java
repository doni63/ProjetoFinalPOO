package DAO;
import VO.Pessoa;
import VO.Paciente;

public class PacienteDAO extends PessoaDAO implements BaseDaoInterfaceDAO{
	private Paciente vo;
	
	public PacienteDAO(Paciente vo) {
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
