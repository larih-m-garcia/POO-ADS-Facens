package poo;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Edson");
        p2.setNome("Matheus");

        System.out.println(p1.PerguntarNome(p2));

    }
}
