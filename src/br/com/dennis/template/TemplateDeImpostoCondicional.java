package br.com.dennis.template;

import br.com.dennis.chain.OrcamentoChain;

public abstract class TemplateDeImpostoCondicional implements ImpostoTemplate{


    @Override
    public double calcula(OrcamentoChain orcamento) {
        if ( deveUserMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    public abstract double maximaTaxacao(OrcamentoChain orcamento);

    public abstract double minimaTaxacao(OrcamentoChain orcamento);

    public abstract boolean deveUserMaximaTaxacao(OrcamentoChain orcamento);
}
