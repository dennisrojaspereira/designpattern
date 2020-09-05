package br.com.dennis.chain;

public class CalculadoraDeDescontos {

//    public double calcula(OrcamentoChain orcamentoChain){
//        // A cada desconto coloca mais um if
//        if ( orcamentoChain.getItens().size() > 5){
//            return orcamentoChain.getValor() * 0.1;
//        }else if ( orcamentoChain.getValor() > 500){
//            return orcamentoChain.getValor() * 0.07;
//        }
//        return 0;
//    }

    public double calcula(OrcamentoChain orcamentoChain){
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisQueQuinhentos();
        Desconto d3 = new SemDesconto();
        d1.setProximo(d2);
        d2.setProximo(d3);
        return d1.desconta(orcamentoChain);

    }

    public static void main(String[] args) {
        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        OrcamentoChain orcamento = new OrcamentoChain(500);
        orcamento.adicionaItem(new Item("CANETA",250));
        orcamento.adicionaItem(new Item("LAPIS",250));

        double descontoFinal = descontos.calcula(orcamento);
        System.out.println(descontoFinal);

    }


}
