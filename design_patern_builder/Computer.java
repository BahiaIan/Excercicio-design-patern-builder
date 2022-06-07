package design_patern_builder;

public class Computer {
	private final Double memoriaRan;
	private final Double discoRigido;
	private final Integer portasUsb;
	private final SaidaVideo saidaVideo;
	private final Double potenciaFonte;
	private final Processador processador;
	private final PlacaVideo placaVideo;

	public Computer(Processador processador, Double potenciaFonte, SaidaVideo saidaVideo, Integer portasUsb,
			Double discoRigido, Double memoriaRan, PlacaVideo placaVideo) {
		this.memoriaRan = memoriaRan;
		this.discoRigido = discoRigido;
		this.portasUsb = portasUsb;
		this.saidaVideo = saidaVideo;
		this.potenciaFonte = potenciaFonte;
		this.processador = processador;
		this.placaVideo = placaVideo;
	}

	public Double getMemoriaRan() {
		return memoriaRan;
	}

	public Double getDiscoRigido() {
		return discoRigido;
	}

	public Integer getPortasUsb() {
		return portasUsb;
	}

	public SaidaVideo getSaidaVideo() {
		return saidaVideo;
	}

	public Double getPotenciaFonte() {
		return potenciaFonte;
	}

	public Processador getProcessador() {
		return processador;
	}

	public PlacaVideo getPlacaVideo() {
		return placaVideo;
	}

}
