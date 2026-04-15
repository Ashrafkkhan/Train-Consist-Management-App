import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class UnsafeCargoException extends Exception {
    public UnsafeCargoException(String message) {
        super(message);
    }
}

class Bogie {
    int id;
    int capacity;
    String type;
    String cargo;

    public Bogie(int id, int capacity, String type) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0!");
        }
        this.id = id;
        this.capacity = capacity;
        this.type = type;
    }

    public void assignCargo(String cargoType) throws UnsafeCargoException {
        if (type.equalsIgnoreCase("Passenger") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new UnsafeCargoException("Cannot assign petroleum to passenger bogie!");
        }
        this.cargo = cargoType;
        System.out.println("Cargo assigned successfully to Bogie " + id);
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity +
               ", Type: " + type + ", Cargo: " + (cargo == null ? "None" : cargo);
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            bogies.add(new Bogie(1, 60, "Passenger"));
            bogies.add(new Bogie(2, 80, "Cargo"));
        } catch (InvalidCapacityException e) {
            System.out.println("Creation Error: " + e.getMessage());
        }

        System.out.println("\n--- Assigning Cargo ---");

        for (Bogie b : bogies) {
            try {
                b.assignCargo("Petroleum");
            } catch (UnsafeCargoException e) {
                System.out.println("Runtime Error: " + e.getMessage());
            } finally {
                System.out.println("Checked Bogie ID: " + b.id);
            }
        }

        System.out.println("\nFinal Bogie List:");
        bogies.forEach(System.out::println);
    }
}