import java.util.*;

public class TrainConsistApp {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities:");

        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        bubbleSort(capacities);

        System.out.println("Sorted Capacities:");

        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}