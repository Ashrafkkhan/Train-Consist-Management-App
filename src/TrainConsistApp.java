import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    int id;
    int capacity;
    String type;

    public Bogie(int id, int capacity, String type) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity + ", Type: " + type;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {

            bogies.add(new Bogie(1, 60, "Passenger"));

            bogies.add(new Bogie(2, 0, "Passenger"));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Bogie List:");
        bogies.forEach(System.out::println);
    }
}