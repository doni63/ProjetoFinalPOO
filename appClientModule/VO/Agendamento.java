package VO;
import java.util.Date;

public class Agendamento extends BaseVO {
	private Date data;
	private String hora;
	private TipoAgendamento tipoAgendamentoId;
	private Funcionario funcionarioId;
	private EquipamentoSala equipamentoSalaId;
	private Paciente pacienteId;
	private EntradaSaida entradaSaidaId;
}
