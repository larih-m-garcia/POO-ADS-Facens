package poo.exercicios.AC1.lista2.exercicio3e4;

public class Vendedor {
    private int codigo;
    private String nome;
    private Double percentualComissao;

    public Vendedor(){

    }

    public Vendedor(int codigo, String nome, Double percentualComissao){
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }
    //exercicio 4
    public static double calcularPagamentoComissaoStatic(Double valorVenda, Double percentualComissao){
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(Double valorVenda, Double desconto){
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public double calcularPagamentoComissao(Double valorVenda){
        return valorVenda * percentualComissao / 100;
    }


    public String imprimir(Double valorVenda, Double desconto){
        return "Código: " + codigo + "\nNome do Vendedor: " + nome + "\n% Comissão: " + percentualComissao +
                "\nDesconto: " + desconto + "\nValor a pagar: " + calcularPagamentoComissao(valorVenda, desconto);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(Double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
