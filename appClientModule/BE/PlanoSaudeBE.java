package BE;

import VO.PlanoSaude;
import DAO.PlanoSaudeDAO;

public class PlanoSaudeBE extends BaseBE implements BaseInterfaceBE{
	private PlanoSaude vo;
	private PlanoSaudeDAO dao;
	
	public PlanoSaudeBE(PlanoSaude vo) {
		this.vo = vo;
		dao = new PlanoSaudeDAO(vo);
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
