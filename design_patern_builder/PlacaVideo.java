package design_patern_builder;

public class PlacaVideo {
	private final Double memoriaVideo;
	private final Double clock;
	private String nome;

	public PlacaVideo(Double memoriaVideo, Double clock, String nome) {
		this.memoriaVideo = memoriaVideo;
		this.clock = clock;
		this.nome = nome;
	}

	public Double getMemoriaVideo() {
		return memoriaVideo;
	}

	public Double getClock() {
		return clock;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
