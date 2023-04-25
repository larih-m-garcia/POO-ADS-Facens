package poo.generalizacao;

public class Generica<T> { //tudo que for T vai ser do mesmo tipo que o passado para classe

    private T objeto;

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
