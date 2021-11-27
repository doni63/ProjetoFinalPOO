package BE;

import DAO.TipoTelefoneDAO;
import VO.Telefone;
import VO.TipoTelefone;

public class TipoTelefoneBE extends TelefoneBE implements BaseInterfaceBE{
	private TipoTelefone vo;
	private TipoTelefoneDAO dao;
	
	public TipoTelefoneBE(TipoTelefone vo) {
		super((Telefone)vo);
		this.vo = vo;
		dao = new TipoTelefoneDAO(vo);
		
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
