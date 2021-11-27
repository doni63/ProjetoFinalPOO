package BE;
import VO.Agendamento;
import VO.TipoAgendamento;
import DAO.TipoAgendamentoDAO;

public class TipoAgendamentoBE extends AgendamentoBE implements BaseInterfaceBE{
	private TipoAgendamento vo;
	private TipoAgendamentoDAO dao;
	
	public TipoAgendamentoBE(TipoAgendamento vo) {
		super((Agendamento)vo);
		this.vo = vo;
		dao = new TipoAgendamentoDAO(vo);
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
