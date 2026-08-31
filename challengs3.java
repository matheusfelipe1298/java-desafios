import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.nome = "Mouse";
        produto1.preco = 100;
        produto1.quantidade = 5;

        produto2.nome = "Celular";
        produto2.preco = 1000;
        produto2.quantidade = 3;

        produto3.nome = "Fone";
        produto3.preco = 70;
        produto3.quantidade = 2;

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double soma = 0;

        for (Produto produto : produtos) {
            System.out.println(produto.nome);

            soma += produto.preco * produto.quantidade;
        }

        System.out.println("Soma de todos os produtos: " + soma);
    }
}