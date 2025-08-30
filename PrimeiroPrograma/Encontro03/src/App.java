public class App {
    public static void main(String[] args) throws Exception {

        Veiculo v1 = new Veiculo();
        v1.setCodigo(1);
        v1.setMarca("Fiat");
        v1.setModelo("Toro");
        v1.setCor("Branco");
        v1.setAno(2025);

        System.out.println("Veículo:");
        System.out.println("Código: " + v1.getCodigo());
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Cor: " + v1.getCor());
        System.out.println("Ano: " + v1.getAno());

        Veiculo v2 = new Veiculo(2,
            "Volkswagen", 
            "Golf", 
            "Vermelho", 
            2025);
        
        System.out.println("Veículo:");
        System.out.println("Código: " + v2.getCodigo());
        System.out.println("Marca: " + v2.getMarca());
        System.out.println("Modelo: " + v2.getModelo());
        System.out.println("Cor: " + v2.getCor());
        System.out.println("Ano: " + v2.getAno());

        Veiculo v3 = new Veiculo(3, 
            "Toyota", 
            "Corolla", 
            "Amarelo", 
            2010);
        
        System.out.println(v3.toString());
    }
}
