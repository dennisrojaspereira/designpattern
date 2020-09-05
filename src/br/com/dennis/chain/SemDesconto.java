package br.com.dennis.chain;

public class SemDesconto implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(OrcamentoChain orcamento){
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
