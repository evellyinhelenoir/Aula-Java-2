package br.com.zup;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem recebidos.");
        int numeros = scan.nextInt();

        while(numeros < 2){
            System.out.println("Número inválido, é necessário ao menos dois números para comparar. Digite novamente.");
            numeros = scan.nextInt();
        }

        int contador = 0;
        int primeiroNumero = 0;
        int menorNumero = 0;
        int maiorNumero = 0;


        if (numeros > 1){
            System.out.println("Digite um número.");
            primeiroNumero = scan.nextInt();
            maiorNumero = primeiroNumero;
            menorNumero = primeiroNumero;

            while(contador < numeros - 1){

                System.out.println("Digite um número.");
                int numerosRecebidos = scan.nextInt();
                if(numerosRecebidos > maiorNumero){
                    maiorNumero = numerosRecebidos;
                }else if(numerosRecebidos < menorNumero){
                    menorNumero = numerosRecebidos;
                }
                contador ++;
            }
            System.out.println(maiorNumero);
            System.out.println(menorNumero);
            System.out.println(maiorNumero + menorNumero);

        }

    }
}
