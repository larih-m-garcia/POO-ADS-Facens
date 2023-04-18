package poo.polimorfismo;

public class Pessoa {

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(Comida comida){
        peso += comida.getPeso();
    }


}
