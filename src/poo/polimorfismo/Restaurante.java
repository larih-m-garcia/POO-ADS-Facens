package poo.polimorfismo;

public class Restaurante {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Carne c = new Carne();
        Salada sa = new Salada();
        Sorvete so = new Sorvete();
        p.setPeso(65);
        c.setPeso(1);
        sa.setPeso(0.1);
        so.setPeso(0.5);
        System.out.println(p.getPeso());
        p.comer(c);
        p.comer(sa);
        p.comer(so);
        System.out.println(p.getPeso());

    }

}
