import java.util.*;

class Bogie {
    int id;
    String type;
    String cargo;

    public Bogie(int id, String type, String cargo) {
        this.id = id;
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Cargo: " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Cylindrical", "Petroleum"));
        bogies.add(new Bogie(2, "Box", "Coal"));
        bogies.add(new Bogie(3, "Cylindrical", "Petroleum"));
        bogies.add(new Bogie(4, "Flatbed", "Steel"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}