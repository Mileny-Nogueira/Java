
public class Main {

	public static void main(String[] args) {
		telefoneCelular celular = new telefoneCelular();
        
        celular.setMarca("Apple");
        celular.setFuncionabilidade(false);
        celular.setCor("Preto");
        celular.setLocalFabricacao("China");
        celular.setAnoLancamento(2023);
        
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Funcionabilidade: " + celular.getFuncionabilidade());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Local de fabricação: " + celular.getLocalFabricacao());
        System.out.println("Ano de Lançamento: " + celular.getAnoLancamento());
    }
}
