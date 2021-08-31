package br.com.zup;


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("Contando de 0 a 100.");

        while (contador < 100){
            contador +=1;
            System.out.println(contador);
        }

        System.out.println("Contando de 100 a 0.");
        for (contador = 100; contador >= 0; contador --){
            System.out.println(contador);
        }

    }
}
