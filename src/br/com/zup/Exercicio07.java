package br.com.zup;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        System.out.println("Digite a quantidade de números que você deseja.");
        double qtdNumeros = scan.nextDouble();

        while (contador <= qtdNumeros){
            System.out.println("Digite os valores a serem somados.");
            int valoresDigitados = scan.nextInt();
            soma = soma + valoresDigitados;
            contador++;
        }
        System.out.println(soma);
    }
}
