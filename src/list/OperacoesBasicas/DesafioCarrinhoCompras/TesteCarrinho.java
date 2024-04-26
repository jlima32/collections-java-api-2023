package list.OperacoesBasicas.DesafioCarrinhoCompras;

public class TesteCarrinho {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Monitor LG 27", 699.90, 1);
        carrinho.adicionarItem("Teclado Rise Mode", 99.90, 2);
        carrinho.adicionarItem("Mouse Logitech G26", 29.90, 1);

        carrinho.exibirItems();

        carrinho.removerItem("Mouse Logitech G26");
        carrinho.exibirItems();

        System.out.println("\nValor total dos itens do carrinho: R$ " + carrinho.calcularValorTotal());

    }
}
