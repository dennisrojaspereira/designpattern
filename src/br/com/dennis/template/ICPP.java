package br.com.dennis.template;

import br.com.dennis.chain.OrcamentoChain;
import br.com.dennis.strategy.Imposto;
import br.com.dennis.strategy.OrcamentoStrategy;

public class ICPP extends TemplateDeImpostoCondicional {


//    @Override
//    public double calcula(OrcamentoChain orcamento) {
//        if ( orcamento.getValor() > 500 ){
//            return orcamento.getValor() * 0.07;
//        }else{
//            return orcamento.getValor() * 0.05;
//        }
//
//    }

    @Override
    public double maximaTaxacao(OrcamentoChain orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public double minimaTaxacao(OrcamentoChain orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public boolean deveUserMaximaTaxacao(OrcamentoChain orcamento) {
        return orcamento.getValor() > 500 ;
    }
}
