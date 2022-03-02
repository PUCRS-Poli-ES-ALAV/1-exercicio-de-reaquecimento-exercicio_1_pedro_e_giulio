package br.pucrs.alav;

/**
Desenvolva algoritmos recursivos para os seguintes problemas e implemente-os (em Java, por exemplo):
    - Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    - Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    - Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
Inversão de uma string.
**/
public class Recursion {

    public static int fibonacci(int num_1){
        if(num_1==1){
            return 1;
        }
        else if(num_1 == 2){
            return 2;
        }
        return 2*fibonacci(n-1) + 3*fibonacci(n-2);
    }

    public static String inverteString(String texto, int count, String invertida){
        if(count==0){
            return invertida+texto.charAt(count);
        }
        return inverteString(texto, count-1, invertida+texto.charAt(count));
    }

    public static double divisao(double num_1, double total){
        if(num_1 == 1){
            return total+1;
        }
        return divisao(num_1-1, total+(1/num_1));

    }


    public static int multiplicacao(int num_1, int num_2, int total){
        if(num_1 == 0){
            return total;
        }
        return multiplicacao(num_1-1, num_2, total+num_2);
    }

    public static int soma(int num_1, int num_2, int total){
        if(num_1 == 0 && num_2 == 0){
            return total;
        }
        else if(num_1 == 0){
            return soma(num_1, num_2-1, total+1);
        }

        return soma(num_1-1, num_2, total+1);
    }



    public static void main(String[] args){
        System.out.println(multiplicacao(10, 6, 0));

        System.out.println(soma(3, 2, 0));

        System.out.println(divisao(4, 0));

        String texto = "batata";
        System.out.println(inverteString(texto, texto.length()-1, ""));
    }
}
