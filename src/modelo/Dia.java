package modelo;

import java.util.Date;

public class Dia {
	
	private int id;
	private Date data;
	private Atendimento atendimento;
	
	public Dia(Date data, Atendimento atendimento) {
		super();
		this.data = data;
		this.atendimento = atendimento;
	}
	
	public Dia() {
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}
	
	public int getId() {
		return this.id;
	}
	
}
