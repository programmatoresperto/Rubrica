import java.util.Scanner;

public class Ordinamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi dell'array (min 10, max 11):");
        int n = scanner.nextInt();

        if (n < 10 || n > 11) {
            System.out.println("Il numero di elementi deve essere tra 10 e 11.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Inserisci " + n + " numeri interi positivi non ripetuti (valore minimo 1, valore massimo 30):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Valori inseriti:    ");
        stampaArray(array);

        selectionSortPari(array);

        System.out.print("Valori ordinati:   ");
        stampaArray(array);

        scanner.close();
    }

    private static void selectionSortPari(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 == 0 && i < n - 1) {
                int minIndex = i;
                for (int j = i + 1; j < n - 1; j++) {
                    if (arr[j] % 2 == 0 && arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // Scambio solo se minIndex è cambiato
                if (minIndex != i) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    private static void stampaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
