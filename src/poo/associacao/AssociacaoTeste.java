package poo.associacao;

public class AssociacaoTeste {

    public static void main(String[] args) {

        Automovel auto1 = new Automovel("up", "branco", 2019);
        Automovel auto2 = new Automovel("onix", "preto", 2014);

        Pessoa p1 = new Pessoa();
        p1.setNome("Alberto");
        p1.setListaAutomoveis(auto1);
        p1.setListaAutomoveis(auto2);
        System.out.println(p1.getListaAutomoveis().get(0).getModelo());
    }
}
