package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] stringArr = {"Bordeaux", "Paris", "Toulouse", "Lille", "Périgueux"};

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }
            System.out.println(stringArr.length);

        stringArr[3] = "Reims";
        System.out.println(Arrays.toString(stringArr));
    }
}
