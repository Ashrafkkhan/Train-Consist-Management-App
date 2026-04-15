import java.util.*;

public class TrainConsistApp {

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

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (bogieIds[i].equals(key)) {
                System.out.println("Bogie found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie not found");
        }
    }
}