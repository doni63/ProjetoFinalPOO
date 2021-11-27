package BE;
import VO.Telefone;
import DAO.TelefoneDAO;

public class TelefoneBE extends BaseBE implements BaseInterfaceBE{
	private Telefone vo;
	private TelefoneDAO dao;
	
	public TelefoneBE(Telefone vo) {
		this.vo =vo;
		dao = new TelefoneDAO(vo);
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
