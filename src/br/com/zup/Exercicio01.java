package br.com.zup;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao nosso caixa eletrônico 24 horas!");
        System.out.println("Garantimos atendimento rápido e eficiênte.");
        System.out.println("Para consultar e calcular os seus impostos, digite abaixo suas informações.");
        System.out.println("OBS: Se o valor do seu salário bruto for menor que 900,00 reais, você estara isento de imposto de renda.");
        System.out.println("Digite as horas trabalhadas.");
        int horasTrabalhadas =  scan.nextInt();
        System.out.println("Digite o valor das horas trabalhadas.");
        int valorHoras = scan.nextInt();


        double salarioBruto = valorHoras * horasTrabalhadas;

        if (salarioBruto <= 0 ){
            System.out.println("Digite o valor do seu salário.");
        }else if (salarioBruto <= 900 ){
            double inss = (salarioBruto * 0.10);
            double IR = (salarioBruto * 0);
            double fgts = (salarioBruto * 0.11);
            double salarioLiquido = (salarioBruto - inss - IR);
            double totalDescontos = (inss + IR);

            System.out.println("\tSalário bruto: (" + valorHoras + " * " + horasTrabalhadas + ") : " + salarioBruto);
            System.out.println("\t(-) IR: "+IR);
            System.out.println("\t(-) INSS: " +inss);
            System.out.println("\tFGTS: "+fgts);
            System.out.println("\tTotal de Descontos: "+totalDescontos);
            System.out.println("\tSalário Líquido: "+salarioLiquido);

        }else if (salarioBruto > 900.01 & salarioBruto <= 1500 ) {
            double inss = (salarioBruto * 0.10);
            double IR = (salarioBruto * 0.05);
            double fgts = (salarioBruto * 0.11);
            double salarioLiquido = (salarioBruto - inss - IR);
            double totalDescontos = (inss + IR);

            System.out.println("\tSalário bruto: (" + valorHoras + " * " + horasTrabalhadas + ") : " + salarioBruto);
            System.out.println("\t(-) IR: "+IR);
            System.out.println("\t(-) INSS: " +inss);
            System.out.println("\tFGTS: "+fgts);
            System.out.println("\tTotal de Descontos: "+totalDescontos);
            System.out.println("\tSalário Líquido: "+salarioLiquido);
        }else if (salarioBruto > 1500.01 & salarioBruto <= 2500 ) {
            double inss = (salarioBruto * 0.10);
            double IR = (salarioBruto * 0.10);
            double fgts = (salarioBruto * 0.11);
            double salarioLiquido = (salarioBruto - inss - IR);
            double totalDescontos = (inss + IR);

            System.out.println("\tSalário bruto: (" + valorHoras + " * " + horasTrabalhadas + ") : " + salarioBruto);
            System.out.println("\t(-) IR: " + IR);
            System.out.println("\t(-) INSS: " + inss);
            System.out.println("\tFGTS: " + fgts);
            System.out.println("\tTotal de Descontos: " + totalDescontos);
            System.out.println("\tSalário Líquido: " + salarioLiquido);
        }else if (salarioBruto > 2500 ) {
            double inss = (salarioBruto * 0.10);
            double IR = (salarioBruto * 0.05);
            double fgts = (salarioBruto * 0.11);
            double salarioLiquido = (salarioBruto - inss - IR);
            double totalDescontos = (inss + IR);

            System.out.println("\tSalário bruto: (" + valorHoras + " * " + horasTrabalhadas + ") : " + salarioBruto);
            System.out.println("\t(-) IR: " + IR);
            System.out.println("\t(-) INSS: " + inss);
            System.out.println("\tFGTS: " + fgts);
            System.out.println("\tTotal de Descontos: " + totalDescontos);
            System.out.println("\tSalário Líquido: " + salarioLiquido);
        }else{
            System.out.println("Dados Informados Inválidos.");
        }
    }
}
