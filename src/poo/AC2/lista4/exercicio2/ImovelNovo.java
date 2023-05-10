package poo.AC2.lista4.exercicio2;

public class ImovelNovo extends Imovel{

    private Double valorAdicional;

    public ImovelNovo(){

    }

    public ImovelNovo(int codigo, String endereco, Double valor, Double valorAdicional) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Double calcularValorImovel(){
        return getValor() + valorAdicional;
    }

    public String imprimir(){
        return "\nCódigo do imóvel: " + getCodigo() + "\nEndereço: " + getEndereco() + "\nValor original: " + getValor() +
                "\nValor Adicional: " + valorAdicional + "\nValor do imóvel com adicional: " + calcularValorImovel();
    }
}
