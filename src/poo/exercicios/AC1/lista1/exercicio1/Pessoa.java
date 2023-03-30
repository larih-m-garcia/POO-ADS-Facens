package poo.exercicios.AC1.lista1.exercicio1;

public class Pessoa {

    private String CPF;
    private String nome;
    private char sexo;
    private int idade;

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSexo(Character sexo){
        this.sexo = sexo;
    }

    public Character getSexo(){
        return sexo;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getIdade(){
        return idade;
    }

    public String imprimir(){
        return "CPF: " + CPF +
                "\nNome: " + nome +
                "\nSexo: " + sexo +
                "\nIdade: " + idade;
    }

}
