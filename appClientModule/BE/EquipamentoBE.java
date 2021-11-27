package BE;

import DAO.EquipamentoDAO;
import VO.Equipamento;

public class EquipamentoBE extends BaseBE implements BaseInterfaceBE{
	private Equipamento vo;
	private EquipamentoDAO dao;
	
	public EquipamentoBE(Equipamento vo) {
		this.vo = vo;
		dao = new EquipamentoDAO(vo);
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
