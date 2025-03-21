package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        short[] arr = { 8, -7, 12, 1, -2, 14, 17, 9 };

        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[10]);

        // Cela echoue car il n'y a pas 10 index dans le tableau
    }
}
