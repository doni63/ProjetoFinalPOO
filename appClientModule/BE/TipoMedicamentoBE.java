package BE;

import VO.Medicamento;
import VO.TipoMedicamento;
import DAO.TipoMedicamentoDAO;

public class TipoMedicamentoBE extends MedicamentoBE implements BaseInterfaceBE{
	private TipoMedicamento vo;
	private TipoMedicamentoDAO dao;
	
	public TipoMedicamentoBE(TipoMedicamento vo) {
		super((Medicamento)vo);
		this.vo = vo;
		dao = new TipoMedicamentoDAO(vo);
		
		
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
