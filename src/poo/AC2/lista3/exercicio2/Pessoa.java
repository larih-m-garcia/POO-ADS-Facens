package poo.AC2.lista3.exercicio2;

import java.util.ArrayList;

public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis = new ArrayList();

    public Pessoa(){

    }

    public Pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public void inserirAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index){
        automoveis.remove(index);
    }

    public String imprimir(){
        return "\nCodigo: " + codigo + "\nNome: " + nome;
    }

    public String imprimirCompleto(){
        String retorno = imprimir();
        retorno += "\nAutomoveis: ";
        for (Automovel auto : automoveis) {
           retorno += auto.imprimir();
        }
        return retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
}
