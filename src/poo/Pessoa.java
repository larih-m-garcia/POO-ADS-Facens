package poo;

import java.util.Objects;

public class Pessoa {

    String nome;
    String telefone;
    String rg;

    public String PerguntarNome(Pessoa p){
        //System.out.println("Qual é o seu nome?");
        //p.ResponderNome();
        String retorno = "";
        retorno += "Qual é o seu nome?\n";
        retorno += p.ResponderNome();
        return retorno;
    }
    public String ResponderNome(){
        //System.out.println("Meu nome é " + nome);
        return "Meu nome é " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(telefone, pessoa.telefone) && Objects.equals(rg, pessoa.rg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, rg);
    }
}

