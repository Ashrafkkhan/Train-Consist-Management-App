import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== UC4 Maintain Ordered Bogie Consist ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("After Adding Bogies:");
        System.out.println("Train Consist: " + trainConsist);

        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println("Train Consist: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println("Train Consist: " + trainConsist);

        System.out.println("UC4 operations completed successfully...");
    }
}