import java.util.ArrayList;

import Dominio.Cliente;
import Repositorio.ClienteRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        ClienteRepositorio repo = new ClienteRepositorio();
        ArrayList<Cliente> clientes = repo.readAll();
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: " + cliente.getCodigo());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Email: " + cliente.getEmail());
        }
    }
}
