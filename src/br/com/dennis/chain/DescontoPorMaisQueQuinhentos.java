package br.com.dennis.chain;

public class DescontoPorMaisQueQuinhentos implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(OrcamentoChain orcamento){
        if( orcamento.getValor() > 500){
            return  orcamento.getValor() * 0.07;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {

        this.proximo = proximo;
    }
}
