package poo.abstrato;

public abstract class Animal {

    public String respirar(){
        return "H2O";
    }

    public abstract String mover(); //if a method is abstract, the class must be abstract

}
