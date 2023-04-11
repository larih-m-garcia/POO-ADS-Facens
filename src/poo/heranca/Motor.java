package poo.heranca;

public class Motor {
    private int fatorDePotencia = 1000;
    private Auto automovel;

    public Motor(Auto automovel){
        this.automovel = automovel;
    }

    public Auto getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Auto automovel) {
        this.automovel = automovel;
    }

    public int getFatorDePotencia() {
        return fatorDePotencia;
    }

    public void setFatorDePotencia(int fatorDePotencia) {
        this.fatorDePotencia = fatorDePotencia;
    }
}