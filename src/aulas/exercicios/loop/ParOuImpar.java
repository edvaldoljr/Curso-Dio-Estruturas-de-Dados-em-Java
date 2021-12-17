package aulas.exercicios.loop;

import java.util.Scanner;

/**
 * Escreve um algoritmo que peça N números inteiros,
 * calcule e mostre a quantidade denúmros pares e
 * a quantidade de números impares.
 */
public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int numero;
        int quantidadePares = 0, quantidadesImpar = 0;

        System.out.print("Quantidade de números: ");
        quantidadeDeNumeros = scan.nextInt();

        System.out.println("");

        int count = 1;
        do {
            System.out.print("Numero " + count + " : ");
            numero = scan.nextInt();

            System.out.println("");

            if (numero % 2  == 0) {
                quantidadePares++;
            } else {
                quantidadesImpar++;
            }

            count++;
        } while (count <= quantidadeDeNumeros);

        System.out.println("Total de pares: " + quantidadePares);
        System.out.println("Total de ímpares: " + quantidadesImpar);
    }
}
