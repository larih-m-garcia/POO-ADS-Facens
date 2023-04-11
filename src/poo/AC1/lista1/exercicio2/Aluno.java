package poo.AC1.lista1.exercicio2;

public class Aluno {

    private String RA;
    private String nome;
    private Float AC1;
    private Float AC2;
    private Float AG;
    private Float AF;

    public void setRA(String ra){
        this.RA = ra;
    }
    public String getRA(){
        return RA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setAC1(Float AC1) {
        this.AC1 = AC1;
    }
    public Float getAC1() {
        return AC1;
    }

    public void setAC2(Float AC2) {
        this.AC2 = AC2;
    }
    public Float getAC2() {
        return AC2;
    }

    public void setAG(Float AG) {
        this.AG = AG;
    }
    public Float getAG() {
        return AG;
    }

    public void setAF(Float AF) {
        this.AF = AF;
    }
    public Float getAF() {
        return AF;
    }

    public float calcularMedia(){
        Double media = ((AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45));
        return media.floatValue();
    }

    public String verificarAprovacao(){
        if(calcularMedia() >= 5) {
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public String imprimir(){
        return "RA: " + RA + "\nNome: " + nome + "\nAC1: " + AC1 +
                "\nAC2: " + AC2 + "\nAG: " + AG + "\nAF: " + AF +
                "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();
    }

}
