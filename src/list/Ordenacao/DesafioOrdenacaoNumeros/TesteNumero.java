package list.Ordenacao.DesafioOrdenacaoNumeros;

public class TesteNumero {
    public static void main(String[] args) {
        OrdenacaoNumero numero = new OrdenacaoNumero();
        numero.adicionarNumero(15);
        numero.adicionarNumero(10);
        numero.adicionarNumero(12);
        numero.adicionarNumero(80);
        numero.adicionarNumero(75);
        numero.adicionarNumero(90);
        numero.adicionarNumero(92);


        System.out.println("Lista em ordem ascendente");
        System.out.println(numero.ordenarAscendente());

        System.out.println("Lista em ordem descendente");
        System.out.println(numero.ordenarDescendente());

    }
}
