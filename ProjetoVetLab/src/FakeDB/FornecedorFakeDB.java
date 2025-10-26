package FakeDB;

import java.util.ArrayList;

import Dominio.Fornecedor;

public class FornecedorFakeDB extends AbsFakeDB<Fornecedor> {
    @Override
    protected void AutoPreencher() {
        if (this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Fornecedor(1, "Mateus e Filhos", "Depósito São Mateus", "123"));
        this.instancia.add(new Fornecedor(2, "Lucas e Filhos", "Depósito São Lucas", "456"));
        this.instancia.add(new Fornecedor(3, "João e Família", "Depósito São João", "789"));
    }
    
    public FornecedorFakeDB(){
        super();
    }
}
