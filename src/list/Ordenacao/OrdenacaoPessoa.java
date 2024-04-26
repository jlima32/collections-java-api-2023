package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.58);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.95);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.66);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 21, 1.82);

        System.out.println("Lista Ordenada por Idade");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("\nLista Ordenada por Altura");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }




}
