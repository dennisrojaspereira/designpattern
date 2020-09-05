package br.com.dennis.template;

import br.com.dennis.chain.OrcamentoChain;
import br.com.dennis.strategy.Imposto;
import br.com.dennis.strategy.OrcamentoStrategy;

public class IKCV extends TemplateDeImpostoCondicional {


//    @Override
//    public double calcula( OrcamentoChain orcamento) {
//        if ( orcamento.getValor() > 500 && itemMaiorQue100Reais(orcamento) ){
//            return orcamento.getValor() * 0.1;
//        }else{
//            return orcamento.getValor() * 0.06;
//        }
//
//    }

    private boolean itemMaiorQue100Reais(OrcamentoChain orcamento) {
        return orcamento.getItens().stream().filter(x -> x.getValor() > 500).count() > 0;
    }

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
        return orcamento.getValor() > 500 && itemMaiorQue100Reais(orcamento);
    }
}
