package BE;

import DAO.EquipamentoSalaDAO;
import VO.EquipamentoSala;

public class EquipamentoSalaBE extends BaseBE implements BaseInterfaceBE{
	private EquipamentoSala vo;
	private EquipamentoSalaDAO dao;
	
	public EquipamentoSalaBE(EquipamentoSala vo) {
		this.vo = vo;
		dao = new EquipamentoSalaDAO(vo);
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
