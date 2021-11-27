package BE;
import VO.Agendamento;
import DAO.AgendamentoDAO;

public class AgendamentoBE extends BaseBE implements BaseInterfaceBE{
	private Agendamento vo;
	private AgendamentoDAO dao;
	
	public AgendamentoBE(Agendamento vo) {
		this.vo = vo;
		dao = new AgendamentoDAO(vo);
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
