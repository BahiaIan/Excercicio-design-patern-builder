package design_patern_builder;

public interface Builder {

	public void setPotenciaFonte(Double potenciaFonte);

	public void setSaidaVideo(SaidaVideo saidaVideo);

	public void setProcessador(Processador processador);

	public void setPortasUsb(Integer portasUsb);

	public void setDiscoRigido(Double discoRigido);

	public void setMemoriaRan(Double memoriaRan);

	public void setPlacaVideo(PlacaVideo placaVideo);
}
