package poo.heranca;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class HerancaTeste {

    public static void main(String[] args) {
        Fusca fusca1 = new Fusca();
        Ferrari ferrari1 = new Ferrari();
        System.out.println(fusca1.getMotor().getFatorDePotencia());
        System.out.println(ferrari1.getMotor().getFatorDePotencia());
        fusca1.acelerar();
        ferrari1.acelerar();
        System.out.println(fusca1.getMotor().getFatorDePotencia());
        System.out.println(ferrari1.getMotor().getFatorDePotencia());

        ArrayList<Auto> automoveis = new ArrayList<>();
        automoveis.add(fusca1);
        automoveis.add(ferrari1);
        for (Auto auto : automoveis){
            System.out.println(auto.getCor());
        }
    }

}
