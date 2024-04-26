package list.Pesquisa.DesafioSomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma(){
        int somaNumeros = 0;
        if(!numeroList.isEmpty()){
            for (Numero n : numeroList){
                int numero = n.getNumero();
                somaNumeros+= numero;
            }
        }
        return somaNumeros;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = -2147483648;
        if(!numeroList.isEmpty()){
            for (Numero n : numeroList){
                int numero = n.getNumero();
                if (numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 2147483647;
        if(!numeroList.isEmpty()){
            for(Numero n : numeroList){
                int numero = n.getNumero();
                if(numero < menorNumero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(this.numeroList);
    }
}
