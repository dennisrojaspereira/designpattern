package br.com.dennis.chain;

public class DescontoPorCincoItens implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(OrcamentoChain orcamento){
        if( orcamento.getItens().size() > 5){
            return  orcamento.getValor() * 0.1;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
