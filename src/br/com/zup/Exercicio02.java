package br.com.zup;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Bem vindo ao Posto 24/7\n");
        System.out.println("Estamos com uma promoção de combustível Àcool!");
        System.out.println("Até 20 litros, desconto de 3% por litro\n" + "Acima de 20 litros, desconto de 5% por litro\n");
        System.out.println("Também estamos com uma promoção de Gasolina!");
        System.out.println("Até 20 litros, desconto de 4% por litro\n" + "Acima de 20 litros, desconto de 6% por litro\n");
        System.out.println("Digite A para Álcool e G para Gasolina.");
        String escolha = scan.nextLine();



        double A = 1.90;
        double G = 2.50;

        // Calcular Álcool

        if (escolha.equals("A") | escolha.equals("a")) {
            System.out.println("Digite a quantidade de litros de Ácool que gostaria de comprar.");
            double litrosVendidosA = scan.nextInt();
            if (litrosVendidosA <= 0) {
                System.out.println("Digite um valor válido.");
            } else if (litrosVendidosA <= 20) {
                double descontA = A * 0.97;
                double valorA = litrosVendidosA * descontA;
                System.out.println("Valor a ser pago: " + valorA);
            } else if (litrosVendidosA > 20.01) {
                double descontA = A * 0.95;
                double valorA = litrosVendidosA * descontA;
                System.out.println("Valor a ser pago: " + valorA);
            } else {
                System.out.println("Valor Inválido.");
            }
        }else if (escolha.equals("G") | escolha.equals("g")) {
            System.out.println("Digite a quantidade de litros de Gasolina que gostaria de comprar.");
            double litrosVendidosG = scan.nextInt();
            if (litrosVendidosG <= 20) {
                double descontG = G * 0.04;
                double valorG = litrosVendidosG * descontG;
                System.out.println("Valor a ser pago: " + valorG);
            } else if (litrosVendidosG > 20.01) {
                double descontG = G * 0.06;
                double valorG = litrosVendidosG * descontG;
                System.out.println("Valor a ser pago: " + valorG);
            } else {
                System.out.println("Valor Inválido.");
            }
        }
}   }

