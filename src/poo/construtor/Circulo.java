package poo.construtor;

public class Circulo {

    double raio;
    static final double pi = 3.1415; //static: variável de classe //final: não é mutável
    static int qtdeObjetos = 0;


    public Circulo(double raio){
        //pi = 3.14;
        this.raio = raio;
        qtdeObjetos ++;
    }
    //sobrecarga de metodo construtor
    public Circulo(){
        //pi = 3.14;
        qtdeObjetos ++;
    }

    public double calcular(){
        return pi * Math.pow(raio,2);
    }

    //sobrecarga de metodo
    static public double calcular(double raio){
        return pi * Math.pow(raio,2);
    }
}
