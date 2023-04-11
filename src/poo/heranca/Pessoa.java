package poo.heranca;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    ArrayList<Auto> listaAutomoveis = new ArrayList<>();
    Auto automovel;


    public Auto getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Auto automovel) {
        this.automovel = automovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Auto> getListaAutomoveis() {
        return listaAutomoveis;
    }

    public void setListaAutomoveis(Auto automovel) {
        this.listaAutomoveis.add(automovel);
    }
}
