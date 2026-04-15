import java.util.*;

public class TrainConsistApp {

    public static int binarySearch(String[] arr, String key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        Arrays.sort(bogieIds);

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        int index = binarySearch(bogieIds, key);

        if (index != -1) {
            System.out.println("Bogie found at position: " + index);
        } else {
            System.out.println("Bogie not found");
        }
    }
}