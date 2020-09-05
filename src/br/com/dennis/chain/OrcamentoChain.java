package br.com.dennis.chain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrcamentoChain {

    private final double valor;

    private List<Item> itens = new ArrayList<>();

    public OrcamentoChain(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
