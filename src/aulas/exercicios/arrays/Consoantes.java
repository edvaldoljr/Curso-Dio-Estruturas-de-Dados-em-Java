package aulas.exercicios.arrays;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas
 * imprima as consoantes.
 */
public class Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes =0, total = 0;

        int count = 0;
        do {

            System.out.println("Letra: ");
            String letra = scan.next();

            if ( ! (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
                total++;

            }

            count++;

        } while (count < consoantes.length);

        System.out.println("Total: " + total);
        System.out.print("Consoantes: ");
        for ( String consoante : consoantes) {

            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }
}