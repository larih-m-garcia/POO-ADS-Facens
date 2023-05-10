package poo.AC2.lista4.exercicio2;

public class Imovel {

    private int codigo;
    private String endereco;
    private Double valor;

    public Imovel(){

    }

    public Imovel(int codigo, String endereco, Double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
