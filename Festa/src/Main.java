
public class Main {

	public static void main(String[] args) {
		FestaAniversario festa = new FestaAniversario();
	
		festa.setDono("Mileny");
		festa.setData("21 de maio");
		festa.setHoraInicio("17:00");
		festa.setHoraFinal("20:00");
		festa.setQtdConvidados(40);
		
		System.out.println("Dono(a) da festa: " + festa.getDono());
		System.out.println("Data: " + festa.getData());
		System.out.println("In�cio: " + festa.getHoraInicio());
		System.out.println("T�rmino: " + festa.getHoraFinal());
		System.out.println("Quantidade de convidados: " + festa.getQtdConvidados());
		
		festa.soltarMusica();

	}
}
