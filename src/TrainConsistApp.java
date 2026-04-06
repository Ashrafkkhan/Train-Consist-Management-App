import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    int capacity;
    String type;

    public Bogie(int id, int capacity, String type) {
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
        bogies.add(new Bogie(1, 50, "Passenger"));
        bogies.add(new Bogie(2, 70, "Passenger"));
        bogies.add(new Bogie(3, 40, "Cargo"));
        bogies.add(new Bogie(4, 65, "Passenger"));
        bogies.add(new Bogie(5, 80, "Cargo"));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("\nType: " + type);
            list.forEach(System.out::println);
        });
    }
}