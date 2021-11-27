package BE;

import DAO.PessoaDAO;
import VO.Pessoa;

public class PessoaBE extends BaseBE implements BaseInterfaceBE {
	private Pessoa vo;
	private PessoaDAO dao;
	
	public PessoaBE(Pessoa vo) {
		this.vo = vo;
		dao = new PessoaDAO(vo);
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
