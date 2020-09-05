package br.com.dennis.chain;

public interface Desconto {

    double desconta(OrcamentoChain orcamentoChain);
    void setProximo(Desconto proximo);
}
