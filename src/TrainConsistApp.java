import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    int id;
    int capacity;

    public Bogie(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50));
        bogies.add(new Bogie(2, 70));
        bogies.add(new Bogie(3, 65));
        bogies.add(new Bogie(4, 40));
        bogies.add(new Bogie(5, 80));

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}