package poo.construtor;

public class TesteCirculo {

    public static void main(String[] args) {
        Circulo circ1 = new Circulo(5.5);
        System.out.println(circ1.calcular());

        Circulo circ2 = new Circulo();
        System.out.println(circ2.calcular(3));

        System.out.println(Circulo.calcular(20));
        System.out.println(Circulo.qtdeObjetos);
    }
}
