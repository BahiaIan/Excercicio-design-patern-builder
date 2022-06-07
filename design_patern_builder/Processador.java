package design_patern_builder;

public class Processador {

	private final Boolean temVideoIntegrado;
	private Double clock;
	private Double temperatuaMaxima;
	private String nome;

	public Processador(Boolean temVideoIntegrado, Double clock, Double temperaturaMaxima, String nome) {
		this.temVideoIntegrado = temVideoIntegrado;
		this.clock = clock;
		this.temperatuaMaxima = temperaturaMaxima;
		this.nome = nome;
	}

	public Double getClock() {
		return clock;
	}

	public void setClock(Double clock) {
		this.clock = clock;
	}

	public Double getTemperatuaMaxima() {
		return temperatuaMaxima;
	}

	public void setTemperatuaMaxima(Double temperatuaMaxima) {
		this.temperatuaMaxima = temperatuaMaxima;
	}

	public Boolean getTemVideoIntegrado() {
		return temVideoIntegrado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
