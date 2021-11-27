package BE;
import VO.Cargo;
import DAO.CargoDAO;

public class CargoBE extends BaseBE implements BaseInterfaceBE {
	private Cargo vo;
	private CargoDAO dao;
	
	public CargoBE(Cargo vo) {
		this.vo = vo;
		dao = new CargoDAO(vo);
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
