package br.com.zup;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double quantidadeDeNumeros;
        double soma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Por favor, digite a quantidade de número");
        quantidadeDeNumeros = scan.nextDouble();

        while(contador < quantidadeDeNumeros){
            System.out.println("Digite um número: ");
            double valorLidoPeloUsuario = scan.nextDouble();
            soma = soma + valorLidoPeloUsuario;
            contador++;
        }
        media = soma / quantidadeDeNumeros;
        System.out.println("A média aritmética é: "+media);
    }
}
