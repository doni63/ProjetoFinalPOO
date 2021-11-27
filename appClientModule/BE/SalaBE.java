package BE;
import VO.Sala;
import DAO.SalaDAO;
public class SalaBE extends BaseBE implements BaseInterfaceBE{
	private Sala vo;
	private SalaDAO dao;
	
	public SalaBE(Sala vo) {
		this.vo = vo;
		dao = new SalaDAO(vo);
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
