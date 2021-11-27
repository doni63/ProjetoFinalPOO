package DAO;
import VO.TipoEquipamento;
import VO.Equipamento;

public class TipoEquipamentoDAO extends EquipamentoDAO implements BaseDaoInterfaceDAO{
	private TipoEquipamento vo;
	
	public TipoEquipamentoDAO(TipoEquipamento vo) {
		super((Equipamento)vo);
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
