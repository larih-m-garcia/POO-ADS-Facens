package poo.abstrato;

public class AulaAbstrato {

    public static void main(String[] args) {
        //Mamifero m = new Mamifero(); it is not possible to instaciate a abstract class
        Cachorro c = new Cachorro();
        System.out.println(c.mover());
        System.out.println(c.respirar());
        System.out.println(c.mamar());
        System.out.println(c.latir());
    }
}
