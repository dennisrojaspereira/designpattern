package br.com.dennis.template;

import br.com.dennis.chain.OrcamentoChain;
import br.com.dennis.strategy.OrcamentoStrategy;

public interface ImpostoTemplate {

    double calcula(OrcamentoChain orcamento);
}
