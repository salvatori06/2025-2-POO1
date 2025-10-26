package Dominio;

public class Fornecedor extends AbsPessoaJuridica{

    public Fornecedor(){}

    public Fornecedor(int codigo, String razaoSocial, 
        String nomeFantasia, String cnpj){
        super(codigo, razaoSocial, nomeFantasia, cnpj);
    }
}