package design_patern_builder;

public class Main {
	public static void main(String args[]) {

		Director director = new Director();

		ComputerBuilder builder = new ComputerBuilder();

		director.montarComputadorMedio(builder);

		Computer computer = builder.getConfiguracaoComputador();

		System.out.println("--Comfiguração do computador--");
		System.out.println("Processador: " + computer.getProcessador().getNome());
		System.out.println("Saida de Video: " + computer.getSaidaVideo());
		System.out.println("Quantidade de portas USB: " + computer.getPortasUsb());
		System.out.println("Potencia da fonte: " + computer.getPotenciaFonte());
		System.out.println("Quantidade de memoria RAM: " + computer.getMemoriaRan());
		System.out.println("Quantidade de disco Rigido: " + computer.getDiscoRigido());
		if (computer.getPlacaVideo() != null) {
			System.out.println("Placa de Video: " + computer.getPlacaVideo().getNome());
		} else {
			System.out.println("Video integrado");
		}
	}

}
