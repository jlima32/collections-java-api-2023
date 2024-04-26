package list.OperacoesBasicas.DesafioCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemsCarrinho;

    public CarrinhoDeCompras() {
        this.itemsCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemsCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i : itemsCarrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itemsCarrinho.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item i : itemsCarrinho) {
            double totalItem = i.getPreco() * i.getQuantidade();
            total += totalItem;
        }
        return total;
    }

    public void exibirItems(){
        System.out.println(itemsCarrinho);
    }

}
