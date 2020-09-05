package br.com.dennis.strategy;

public class CalculadorDeImpostos {

//    public double realizaCalculo(Orcamento orcamento,String imposto){
//        // Problema muitos if's se o numero de impostos aumentar
//        if( imposto.equals("ICMS")){
//            return orcamento.getValor() * 0.1;
//        }else if ( imposto.equals("ISS")){
//            return orcamento.getValor() * 0.06;
//        }
//    }

    public double realizaCalculo(OrcamentoStrategy orcamentoStrategy, Imposto imposto){
        return imposto.calcula(orcamentoStrategy);

    }


}
