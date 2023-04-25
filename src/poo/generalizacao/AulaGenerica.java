package poo.generalizacao;

import poo.Pessoa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AulaGenerica {
    public static void main(String[] args) {
        int x = 1;
        double y = 2.3;
        String nome = "Edson";
        Pessoa p1 = new Pessoa();

        QualquerCoisa q1 = new QualquerCoisa();
        QualquerCoisa q2 = new QualquerCoisa();
        QualquerCoisa q3 = new QualquerCoisa();
        QualquerCoisa q4 = new QualquerCoisa();
        q1.setCoisa(x);
        q2.setCoisa(y);
        q3.setCoisa(nome);
        q4.setCoisa(p1);
        ArrayList<Object> listaGeral = new ArrayList<>();
        listaGeral.add(x);
        listaGeral.add(y);
        listaGeral.add(nome);
        listaGeral.add(p1);
        for (Object o : listaGeral) {
            System.out.println(o);
        }

        //exemplo de Generics
        Generica<Integer> gen = new Generica<>();
        gen.setObjeto(x);
        Generica<Pessoa> genP = new Generica<>();
        genP.setObjeto(p1);

    }
}
