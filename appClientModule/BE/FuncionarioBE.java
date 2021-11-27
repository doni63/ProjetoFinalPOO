package BE;
import VO.Pessoa;
import VO.Funcionario;
import DAO.FuncionarioDAO;

public class FuncionarioBE extends PessoaBE implements BaseInterfaceBE {
	private Funcionario vo;
	private FuncionarioDAO dao;
	
	public FuncionarioBE(Funcionario vo) {
		super((Pessoa)vo);
		dao = new FuncionarioDAO(vo);
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
