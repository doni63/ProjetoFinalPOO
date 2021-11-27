package DAO;

import VO.Sala;
import VO.TipoSala;

public class TipoSalaDAO extends SalaDAO implements BaseDaoInterfaceDAO{
	private TipoSala vo;
	
	public TipoSalaDAO(TipoSala vo) {
		super((Sala)vo);
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
