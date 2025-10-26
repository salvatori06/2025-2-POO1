package Dominio;

public abstract class AbsPessoaJuridica extends AbsIdentificador{
    protected String razaoSocial;
    protected String nomeFantasia;
    protected String cnpj;
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public AbsPessoaJuridica(){
        super();
    }
    public AbsPessoaJuridica(int codigo, String razaoSocial, String nomeFantasia, String cnpj) {
        super(codigo);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    
}
