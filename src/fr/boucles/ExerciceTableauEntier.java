package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};

        System.out.println(arr[0] + "\n" + arr.length + "\n" + arr[arr.length -1]);

        arr[4] = 8;
        System.out.println(Arrays.toString(arr));
    }
}
