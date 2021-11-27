package BE;
import VO.Sala;
import VO.TipoSala;
import VO.TipoSala;
import DAO.TipoSalaDAO;

public class TipoSalaBE extends SalaBE implements BaseInterfaceBE{
	private TipoSala vo;
	private TipoSalaDAO dao;
	
	public TipoSalaBE(TipoSala vo) {
		super((Sala)vo);
		this.vo = vo;
		dao = new TipoSalaDAO(vo);
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
