package BE;
import VO.Pessoa;
import VO.Paciente;
import DAO.PacienteDAO;

public class PacienteBE extends PessoaBE implements BaseInterfaceBE{
	private Paciente vo;
	private PacienteDAO dao;
	
	public PacienteBE(Paciente vo) {
		super((Pessoa)vo);
		this.vo = vo;
		dao = new PacienteDAO(vo);
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
