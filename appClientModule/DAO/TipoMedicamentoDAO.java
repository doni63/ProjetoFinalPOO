package DAO;
import VO.Medicamento;
import VO.TipoMedicamento;

public class TipoMedicamentoDAO extends MedicamentoDAO implements BaseDaoInterfaceDAO{
	private TipoMedicamento vo;
	
	public TipoMedicamentoDAO(TipoMedicamento vo) {
		super((Medicamento)vo);
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
