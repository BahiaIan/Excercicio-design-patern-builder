package design_patern_builder;

public class Director {
	public void montarComputadorBasico(Builder builder) {
		builder.setPotenciaFonte(400.0);
		builder.setSaidaVideo(SaidaVideo.VGA);
		builder.setProcessador(new Processador(true, 4.0, 80.0, "Pentium"));
		builder.setPortasUsb(4);
		builder.setDiscoRigido(960.0);
		builder.setMemoriaRan(8.0);
		builder.setPlacaVideo(null);
	}

	public void montarComputadorMedio(Builder builder) {
		builder.setPotenciaFonte(600.0);
		builder.setSaidaVideo(SaidaVideo.HDMI);
		builder.setProcessador(new Processador(true, 4.0, 95.0, "Ryzem 5600G"));
		builder.setPortasUsb(6);
		builder.setDiscoRigido(1920.0);
		builder.setMemoriaRan(16.0);
		builder.setPlacaVideo(new PlacaVideo(3.0, 14.0, "GTX 1060 TI"));
	}

	public void montarComputadorTop(Builder builder) {
		builder.setPotenciaFonte(1000.0);
		builder.setSaidaVideo(SaidaVideo.DISPLAY_PORT);
		builder.setProcessador(new Processador(false, 4.0, 95.0, "I9"));
		builder.setPortasUsb(8);
		builder.setDiscoRigido(3840.0);
		builder.setMemoriaRan(32.0);
		builder.setPlacaVideo(new PlacaVideo(8.0, 14.0, "RTX 3060 TI"));
	}
}
