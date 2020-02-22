package modelo;

public class Atendimento {
	
	private int id;
	private String paciente;
	private String horario;

	public Atendimento() {
		
	}

	public Atendimento(String paciente, String horario) {
		super();
		this.paciente = paciente;
		this.horario = horario;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public int getId() {
		return this.id;
	}
	
}
