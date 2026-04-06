import java.util.*;

class Bogie {
    int id;
    int capacity;
    String type;

    public Bogie(int id, int capacity, String type) {
        this.id = id;
        this.capacity = capacity;
        this.type = type;
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

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}