package poo.associacao;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    ArrayList<Automovel> listaAutomoveis = new ArrayList<>();
    Automovel automovel;


    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getListaAutomoveis() {
        return listaAutomoveis;
    }

    public void setListaAutomoveis(Automovel automovel) {
        this.listaAutomoveis.add(automovel);
    }
}
