package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Testes {

    public void teste1() {
        int[] poupanca = {1,2,3,4};
        int valorTotal = 0;

        for (int valor : poupanca) {
            valorTotal += valor;
        }

        System.out.println("Teste 1: " + valorTotal);
    }

    public void teste2(){
        int[] entrada = {2,3,4};
        int valorTotal = 0;

        for(int valor: entrada) {
            valorTotal += valor;
        }

        int mediaValorTotal = valorTotal / entrada.length;

        System.out.println("Teste 2: " + mediaValorTotal);
    }

    public void teste3(){
        int[] entrada = {10,5,20};

        int numero = entrada[0];
        int limiteInferior = entrada[1];
        int limiteSuperior = entrada[2];

        if ((numero >= limiteInferior) && (numero <= limiteSuperior)) {
            System.out.println("Teste 3: " + "PERTENCE");
        } else {
            System.out.println("Teste 3: " + "NAO PERTENCE");
        }
    }

    public void teste4(){
        int valorMinimo = 2;
        int valorMaximo = 10;
        int[] valorJogadores = {0,5,6,10,11};

        List<Integer> valoresPermitidos = new ArrayList<Integer>();

        for (int valor: valorJogadores) {
            if (valor >= valorMinimo && valor <= valorMaximo){
                valoresPermitidos.add(valor);
            }
        }
        System.out.println("Teste 4: " + valoresPermitidos);
    }

}
