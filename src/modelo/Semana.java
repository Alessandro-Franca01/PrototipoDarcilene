package modelo;

	// Semana vai ter 7 Dias que são 7 "composiçoes"
public class Semana {
	
	private int id;
	private Dia segunda;
	private Dia terca;
	private Dia quarta;
	private Dia quinta;
	private Dia sexta;
	private Dia sabado;
	private Dia domingo;
	
	public Semana(int id, Dia segunda, Dia terca, Dia quarta, Dia quinta, Dia sexta, Dia sabado, Dia domingo) {
		super();
		this.id = id;
		this.segunda = segunda;
		this.terca = terca;
		this.quarta = quarta;
		this.quinta = quinta;
		this.sexta = sexta;
		this.sabado = sabado;
		this.domingo = domingo;
	}
	
	public Semana() {
		
	}

	public Dia getSegunda() {
		return segunda;
	}

	public void setSegunda(Dia segunda) {
		this.segunda = segunda;
	}

	public Dia getTerca() {
		return terca;
	}

	public void setTerca(Dia terca) {
		this.terca = terca;
	}

	public Dia getQuarta() {
		return quarta;
	}

	public void setQuarta(Dia quarta) {
		this.quarta = quarta;
	}

	public Dia getQuinta() {
		return quinta;
	}

	public void setQuinta(Dia quinta) {
		this.quinta = quinta;
	}

	public Dia getSexta() {
		return sexta;
	}

	public void setSexta(Dia sexta) {
		this.sexta = sexta;
	}

	public Dia getSabado() {
		return sabado;
	}

	public void setSabado(Dia sabado) {
		this.sabado = sabado;
	}

	public Dia getDomingo() {
		return domingo;
	}

	public void setDomingo(Dia domingo) {
		this.domingo = domingo;
	}
	
	public int getId() {
		return this.id;
	}
	
	
}
