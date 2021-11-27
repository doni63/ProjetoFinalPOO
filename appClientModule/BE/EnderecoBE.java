package BE;

import DAO.EnderecoDAO;
import VO.Endereco;

public class EnderecoBE extends BaseBE implements BaseInterfaceBE{
	private Endereco vo;
	private EnderecoDAO dao;
	
	public EnderecoBE(Endereco vo) {
		this.vo = vo;
		dao = new EnderecoDAO(vo);
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
