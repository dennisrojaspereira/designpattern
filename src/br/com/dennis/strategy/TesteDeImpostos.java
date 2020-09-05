package br.com.dennis.strategy;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        OrcamentoStrategy orcamentoStrategy = new OrcamentoStrategy(500.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        System.out.println(calculador.realizaCalculo(orcamentoStrategy,iss));
        System.out.println(calculador.realizaCalculo(orcamentoStrategy,icms));
    }
}
