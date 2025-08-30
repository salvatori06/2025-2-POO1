public class Veiculo {

    private int codigo;

    private String marca;

    private String modelo;

    private String cor;

    private int ano;

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int valor){
        this.codigo = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Veiculo(){
    }

    public Veiculo(int pcodigo, String pmarca, String pmodelo, 
        String pcor, int pano){
            this.codigo = pcodigo;
            this.marca = pmarca;
            this.modelo = pmodelo;
            this.cor = pcor;
            this.ano = pano;
        }

    @Override
    public String toString() {
        return "Veiculo [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano
                + "]";
    }
    
    
}
