import java.util.ArrayList;

import Dominio.Fornecedor;
import Repositorio.FornecedorRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        FornecedorRepositorio repo = new FornecedorRepositorio();
        ArrayList<Fornecedor> forns = repo.readAll();
        for (Fornecedor forn : forns) {
            System.out.println("Codigo: " + forn.getCodigo());
            System.out.println("CPF: " + forn.getCnpj());
            System.out.println("Razão Social: " + forn.getRazaoSocial());
            System.out.println("Nome Fantasia: " + forn.getNomeFantasia());
            
        }
    }
}
