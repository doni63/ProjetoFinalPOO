package DAO;
import VO.TipoAgendamento;
import VO.Agendamento;

public class TipoAgendamentoDAO extends AgendamentoDAO implements BaseDaoInterfaceDAO{
	private TipoAgendamento vo;
	
	public TipoAgendamentoDAO(TipoAgendamento vo) {
		super((Agendamento)vo);
		this.vo =vo;
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
