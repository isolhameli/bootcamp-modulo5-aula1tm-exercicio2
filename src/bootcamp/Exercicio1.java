package bootcamp;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio1 {

    public static void main(String[] args) {

        // Feito manualmente
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Integer[] ascendingArray = bubbleSort(array, true);
        System.out.println("Analise manual\n");
        System.out.println("Ordem crescente: " + Arrays.asList(ascendingArray));
        Integer[] descendingArray = bubbleSort(array, false);
        System.out.println("Ordem decrescente: " + Arrays.asList(descendingArray));

        // Feito utilizando Collections
        System.out.println("\nAnalise com Collection\n");
        ascendingArray = collectionSort(array, true);
        System.out.println("Ordem crescente: " + Arrays.asList(ascendingArray));
        descendingArray = collectionSort(array, false);
        System.out.println("Ordem decrescente: " + Arrays.asList(descendingArray));
    }

    public static Integer[] bubbleSort(Integer[] array, boolean ascending) {

        int temp;
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }

        if (!ascending) {
            array = reverseArray(array);
        }

        return array;

    }

    public static Integer[] reverseArray(Integer[] array) {
        Integer[] arrayRevert = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRevert[i] = array[array.length - (i + 1)];
        }
        return arrayRevert;
    }

    private static Integer[] collectionSort(Integer[] array, boolean ascending) {
        if (ascending) {
            Arrays.sort(array);
            return array;
        }
        Collections.reverse(Arrays.asList(array));
        return array;
    }
}
