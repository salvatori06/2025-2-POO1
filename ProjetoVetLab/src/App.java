import java.util.ArrayList;

import Dominio.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setNome("Luiz Augusto");
        c1.setCpf("12345678932");
        c1.setEmail("luizao@uniderp.edu.br");
        c1.setNumeroCartao("123");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);

        Cliente c2 = new Cliente(2, "Mateus", "123", "mateus@uniderp.com.br", "456");
        clientes.add(c2);
    }
}
