package BE;

import DAO.EntradaSaidaDAO;
import VO.EntradaSaida;

public class EntradaSaidaBE extends BaseBE implements BaseInterfaceBE{
	private EntradaSaida vo;
	private EntradaSaidaDAO dao;
	
	public EntradaSaidaBE(EntradaSaida vo) {
		this.vo = vo;
		dao = new EntradaSaidaDAO(vo);
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
