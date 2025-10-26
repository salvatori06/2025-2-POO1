package Repositorio;

import java.util.ArrayList;

import Dominio.Fornecedor;
import FakeDB.FornecedorFakeDB;

public class FornecedorRepositorio extends AbsRepositorio<Fornecedor>{

	public FornecedorRepositorio() {
		this.baseDeDados = new FornecedorFakeDB();
		this.dados = this.baseDeDados.getInstancia();
	}
	
	@Override
	public Fornecedor create(Fornecedor instancia) {
		Fornecedor ultimo = this.dados.getLast();
        int chave = ultimo.getCodigo() + 1;
        instancia.setCodigo(chave);
        this.dados.add(instancia);
        return instancia;
	}

	@Override
	public Fornecedor readOne(int codigo) {
        ArrayList<Fornecedor> lista = this.dados;
        for (Fornecedor forn : lista) {
            if(forn.getCodigo() == codigo){
                return forn;
            }
        }
        return null;
	}

	@Override
	public Fornecedor update(Fornecedor instancia) {
		Fornecedor alterado = this.readOne(instancia.getCodigo());
		if (alterado != null) {
			alterado.setCnpj(instancia.getCnpj());
			alterado.setNomeFantasia(instancia.getNomeFantasia());
			alterado.setRazaoSocial(instancia.getRazaoSocial());
			return alterado;
		}
		return alterado;
	}

	@Override
	public Fornecedor deleteById(int codigo) {
		Fornecedor deletado = this.readOne(codigo);
		if (deletado != null) {
			this.dados.remove(deletado);
			return deletado;
		}
		return deletado;
	}

	@Override
	public Fornecedor deleteByInstance(Fornecedor instancia) {
		return this.deleteById(instancia.getCodigo());
	}

}
