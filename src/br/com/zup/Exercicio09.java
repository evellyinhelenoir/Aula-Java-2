package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Exercicio09 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(10);
        todosOsNumeros.add(534552);
        todosOsNumeros.add(8243);
        todosOsNumeros.add(937410);
        todosOsNumeros.add(59373);
        todosOsNumeros.add(811222);
        todosOsNumeros.add(1006557);

        for (Integer referencia : todosOsNumeros){
            if (referencia % 2 == 0){
                numerosPares.add(referencia);
            }else {
                numerosImpares.add(referencia);
            }
        }
        System.out.println("Todos os números:");
        System.out.println(todosOsNumeros);
        System.out.println("Numeros Pares:");
        System.out.println(numerosPares);
        System.out.println("Numeros Impares:");
        System.out.println(numerosImpares);
    }
}
