import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC5 Preserve Insertion Order of Bogies ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("After Attaching Bogies:");
        System.out.println("Train Formation: " + trainFormation);

        System.out.println("Duplicate bogie 'Sleeper' ignored automatically...");

        System.out.println("Final Train Formation (Ordered & Unique): " + trainFormation);

        System.out.println("UC5 operations completed successfully...");
    }
}