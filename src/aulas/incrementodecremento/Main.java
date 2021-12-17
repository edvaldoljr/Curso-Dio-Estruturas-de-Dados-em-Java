package aulas.incrementodecremento;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        /**
         * Aqui podemos ver dois tipos de exemplo que são os,
         * Pré-Fixados (++variavel , --variavel) que vão somar ou subtrair uma unidade ao valor da variável e os
         * Pós-Fixados (variavel++ ,  variavel--) que iram somar ou subtrair um ao valor da variável, retornando
         * o valor original.
         */

        c = a++;
        System.out.println(c);
        c = ++a;
        System.out.println(c);
        c = a--;
        System.out.println(c);
        c = --a;
        System.out.println(c);
        c = a + b++;
        System.out.println(c);
        c = a + ++b;
        System.out.println(c);
        c = a - b--;
        System.out.println(c);
        c = a - --b;
        System.out.println(c);
        c = a * b++;
        System.out.println(c);
        c = a * ++b;
        System.out.println(c);
        c = a / b--;
        System.out.println(c);
        c = a / --b;
        System.out.println(c);
        c = a % b++;
        System.out.println(c);
        c = a % ++b;
        System.out.println(c);
    }
}
