package br.com.zup;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pontuacao = 0;

        System.out.println("Sou uma detetive particular e estou aqui para fazer algumas perguntas.");
        System.out.println("Por favor, responda sómente 'S' para SIM e 'N' para NÃO\n");

        System.out.println("Telefonou para a vítima?");
        String telefonou = scan.nextLine();
        if (telefonou.equals("S")){
            pontuacao = pontuacao +1;
        }
        System.out.println("Esteve no local do crime?");
        String local = scan.nextLine();
        if (local.equals("S")){
            pontuacao = pontuacao +1;
        }
        System.out.println("Mora perto da vítima?");
        String moradia = scan.nextLine();
        if (moradia.equals("S")){
            pontuacao = pontuacao +1;
        }
        System.out.println("Devia para a vítima?");
        String devia = scan.nextLine();
        if (devia.equals("S")){
            pontuacao = pontuacao +1;
        }
        System.out.println("Já trabalhou com a vítima?");
        String trabalhou = scan.nextLine();
        if (trabalhou.equals("S")){
            pontuacao = pontuacao +1;
        }
        System.out.println("\nMuito obrigada, eu já sei sua participação no crime.\n");
        if (pontuacao <= 1 & pontuacao >= 0){
            System.out.println("Você é inocente!");
        }else if (pontuacao == 2){
            System.out.println("Você é suspeito!");
        }else if (pontuacao >= 3 & pontuacao <= 4){
            System.out.println("Você é cumplice!");
        }else if (pontuacao == 5) {
            System.out.println("Você é o assassino!");
        }
    }
}
