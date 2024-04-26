package list.Pesquisa.DesafioSomaNumeros;

public class TesteNumero {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(55);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(2225);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(72);
        numeros.adicionarNumero(385);

        numeros.exibirNumeros();
        System.out.println("O resultado da soma de todos os números da lista é: "+ numeros.calcularSoma());
        System.out.println("O maior número da lista é: "+ numeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: "+ numeros.encontrarMenorNumero());

    }
}
