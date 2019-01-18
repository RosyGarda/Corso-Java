package lez.ad_02;

import java.util.Scanner;

public class LezAD_02 {

    public static void main(String[] args) {
        int[] numeri = {34, 2, 67, 26, 38, 17, 88, 93};
        stampa(numeri);
    }

    public static void stampa(int[] array) {
        for (int numeri : array) {
            System.out.println(numeri);
        }
    }

    //      trovare il massimo, in un array di numeri
    public static int maximum(int[] array) {
        Scanner s = new Scanner(System.in);
        int m = array [0];
    for (int i = 1; i < array.length; i++) {
            if (array[i] > i) {i = array[i];
            }
        }
        return m;
    }

//      estrarre i numeri pari
    public static int[] equalidoram(int[] array) {

        if (n % 2 == 0) {
            System.out.print("il numero è pari");
        } else {
            System.out.print("il numero è dispari");
        }

        //      ricerca di un numero
    public static boolean toma(int[] array, int numero) {

    }

    //      ordina  "sort"
    public static void deCaus(int[] array) {

    }
}
