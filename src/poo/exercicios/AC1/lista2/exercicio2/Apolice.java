package poo.exercicios.AC1.lista2.exercicio2;

public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private Double valorAutomovel;


    public Apolice(){

    }

    public Apolice(int numero, String nome, int idade, char sexo, Double valorAutomovel){
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(Double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public Double calcularValor(Character sexo, Integer idade){
        if(Character.toUpperCase(sexo) == 'M' && idade <= 25){
            return valorAutomovel * 10 / 100;
        }else if (Character.toUpperCase(sexo) == 'M' && idade > 25){
            return valorAutomovel * 5 /100;
        }else {
            return valorAutomovel * 2 /100;
        }
    }

    public String imprimir(){
        return "Número da Apólice: " + numero + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo +
                "\nValor do Automóvel: " + valorAutomovel + "\nValor da Apólice: " + calcularValor(sexo, idade);
    }
}
