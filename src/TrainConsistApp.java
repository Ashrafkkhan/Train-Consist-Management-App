import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieTypes = new String[n];

        System.out.println("Enter bogie type names:");

        for (int i = 0; i < n; i++) {
            bogieTypes[i] = sc.nextLine();
        }

        Arrays.sort(bogieTypes);

        System.out.println("\nSorted Bogie Names:");

        for (String type : bogieTypes) {
            System.out.println(type);
        }
    }
}