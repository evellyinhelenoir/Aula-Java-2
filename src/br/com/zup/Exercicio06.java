package br.com.zup;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdNumerosPares = 0;
        int qtdNumerosImpares =0;
        int contador = 1;
        System.out.println("Digite a quantidade de números que você deseja.");
        double qtdNumeros = scan.nextDouble();

        while (contador <= qtdNumeros){
            System.out.println("Digite o número "+contador+" :");
            double valorDigitado = scan.nextDouble();

            if (valorDigitado % 2 == 0){
                qtdNumerosPares = qtdNumerosPares + 1;
            }else if (valorDigitado % 2 == 1){
                qtdNumerosImpares = qtdNumerosImpares + 1;
            }
            contador++;
        }
        System.out.println("A quantidade de números pares são: "+qtdNumerosPares);
        System.out.println("A quantidade de números impares são: "+qtdNumerosImpares);

    }
}
