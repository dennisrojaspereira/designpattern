package br.com.dennis.strategy;

public class ICMS implements Imposto{

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy){
        return orcamentoStrategy.getValor() * 0.1;
    }
}
