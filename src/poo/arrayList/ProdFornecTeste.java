package poo.arrayList;

import java.util.ArrayList;

public class ProdFornecTeste {

    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor();
        Fornecedor f2 = new Fornecedor();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        f1.setNome("Hp");
        f2.setNome("Dell");
        p1.setNome("notebook");
        p2.setNome("caneta");
        p3.setNome("mouse");

        f1.setProduto(p1);
        f2.setProduto(p2);
        f2.setProduto(p3);

//        for (Produto produto : f2.getListaProdutos()) {
//            System.out.println(produto.getNome());
//        }

        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);

        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Fornecedor: " + fornecedor.getNome());
            for (Produto produto : fornecedor.getListaProdutos()) {
                System.out.println("Produto: " + produto.getNome());
            }
        }

    }
}
