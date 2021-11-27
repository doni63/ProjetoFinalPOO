package BE;
import VO.Medicamento;
import DAO.MedicamentoDAO;

public class MedicamentoBE extends BaseBE implements BaseInterfaceBE{
	private Medicamento vo;
	private MedicamentoDAO dao;
	
	public MedicamentoBE(Medicamento vo) {
		this.vo = vo;
		dao = new MedicamentoDAO(vo);
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
