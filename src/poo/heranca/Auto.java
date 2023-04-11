package poo.heranca;

public class Auto {
    private String modelo;
    private String cor;
    private int ano;
    private Motor motor;
    private Pessoa dono;

    public Auto(){
        this.motor = new Motor(this);
    }

    public Auto(String cor, int ano){
       //this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(this);
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public void acelerar(){
        this.motor.setFatorDePotencia(this.motor.getFatorDePotencia() + 1);
    }

    public void desacelerar(){
        if(this.motor.getFatorDePotencia() > 0){
            this.motor.setFatorDePotencia(this.motor.getFatorDePotencia() - 1);
        }
    }

//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
