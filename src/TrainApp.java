import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC3 Track Unique Bogie Types ===");

        Set<String> bogieTypes = new HashSet<>();

        bogieTypes.add("Sleeper");
        bogieTypes.add("AC Chair");
        bogieTypes.add("First Class");
        bogieTypes.add("Sleeper");
        bogieTypes.add("AC Chair");

        System.out.println("After Adding Bogie Types:");
        System.out.println("Passenger Bogies: " + bogieTypes);

        System.out.println("Adding duplicate bogies (Sleeper, AC Chair) ignored automatically...");

        System.out.println("Final Train Passenger Consist: " + bogieTypes);

        System.out.println("UC3 operations completed successfully...");
    }
}