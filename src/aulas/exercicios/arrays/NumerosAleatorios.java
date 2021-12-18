package aulas.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Faça um algoritmo que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números, seus sucessores e antecessores.
 */
public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int [20];

        for (int i = 0 ; i < numerosAleatorios.length ; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatórios: ");
        for (int numeros : numerosAleatorios ){
            System.out.print(numeros + " ");
        }

        System.out.print("\nSucessores dos Numeros aleatórios: ");
        for (int numeros : numerosAleatorios ){
            System.out.print((numeros + 1 ) + " ");
        }

        System.out.print("\nAntecessores dos Numeros aleatórios: ");
        for (int numeros : numerosAleatorios ){
            System.out.print((numeros - 1 ) + " ");
        }
    }
}
