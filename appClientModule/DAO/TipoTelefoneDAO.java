package DAO;

import VO.Telefone;
import VO.TipoTelefone;

public class TipoTelefoneDAO extends TelefoneDAO implements BaseDaoInterfaceDAO{
	private TipoTelefone vo;
	
	public TipoTelefoneDAO(TipoTelefone vo) {
		super((Telefone)vo);
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
