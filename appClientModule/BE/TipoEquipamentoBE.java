package BE;
import VO.Equipamento;
import VO.TipoEquipamento;
import DAO.TipoEquipamentoDAO;

public class TipoEquipamentoBE extends EquipamentoBE implements BaseInterfaceBE{
	private TipoEquipamento vo;
	private TipoEquipamentoDAO dao;
	
	public TipoEquipamentoBE(TipoEquipamento vo) {
		super((Equipamento)vo);
		this.vo = vo;
		dao = new TipoEquipamentoDAO(vo);
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
