package poo.AC2.lista4.exercicio2;

public class ImovelVelho extends Imovel{

    private Double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(int codigo, String endereco, Double valor, Double valorDesconto) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double calcularValorImovel(){
        return getValor() - valorDesconto;
    }

    public String imprimir(){
        return "\nCódigo do imóvel: " + getCodigo() + "\nEndereço: " + getEndereco() + "\nValor original: " + getValor() +
                "\nValor do Desconto: " + valorDesconto + "\nValor do imóvel com desconto: " + calcularValorImovel();
    }
}
