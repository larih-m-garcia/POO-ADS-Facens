package poo.arrayList;

import java.util.ArrayList;

public class Fornecedor {

    private String nome;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();


    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }


    public void setProduto(Produto novoProduto){
        listaProdutos.add(novoProduto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
