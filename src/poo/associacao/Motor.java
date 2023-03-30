package poo.associacao;

public class Motor {
    private int fatorDePotencia;
    private Automovel automovel;

    public Motor(Automovel automovel){
        this.automovel = automovel;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public int getFatorDePotencia() {
        return fatorDePotencia;
    }

    public void setFatorDePotencia(int fatorDePotencia) {
        this.fatorDePotencia = fatorDePotencia;
    }
}
