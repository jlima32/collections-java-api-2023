package list.Ordenacao.DesafioOrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Numero> numeroList;


    public OrdenacaoNumero() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List <Numero> ordemAscendente = new ArrayList<>(numeroList);
        Collections.sort(ordemAscendente);
        return ordemAscendente;

    }

    public List<Numero> ordenarDescendente(){
        List <Numero> ordemDescendente = new ArrayList<>(numeroList);
        Collections.sort(ordemDescendente, Collections.reverseOrder());
        return ordemDescendente;
    }

    public void exibirNumeros(){
        System.out.println(numeroList);
    }
}
