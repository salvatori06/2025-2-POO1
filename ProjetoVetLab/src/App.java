import java.util.ArrayList;

import Dominio.Veterinario;
import Repositorio.VeterinarioRepositorio;

public class App {
    public static void main(String[] args) throws Exception {
        VeterinarioRepositorio repo = new VeterinarioRepositorio();
        ArrayList<Veterinario> vet = repo.readAll();
        for (Veterinario v : vet) {
            System.out.println("Codigo: " + v.getCodigo());
            System.out.println("Nome: " + v.getNome());
            System.out.println("CPF: " + v.getCpf());
            System.out.println("Email: " + v.getEmail());
            System.out.println("RG: " + v.getRg());
            System.out.println("CRMV: " + v.getRegCRMV());          
        }
    }
}