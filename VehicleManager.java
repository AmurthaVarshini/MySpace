import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Vehicle {
    private String model;
    private int year;
    private double price;

    public Vehicle(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year + ", Price: ₹" + price;
    }
}

public class VehicleManager {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda City", 2022, 1200000));
        vehicles.add(new Vehicle("Toyota Innova", 2018, 1800000));
        vehicles.add(new Vehicle("Maruti Swift", 2020, 800000));
        vehicles.add(new Vehicle("Hyundai i20", 2019, 900000));

        List<Vehicle> expensiveVehicles = vehicles.stream()
                .filter(v -> v.getPrice() > 1000000)
                .collect(Collectors.toList());

        System.out.println("Vehicles priced above ₹10,00,000:");
        expensiveVehicles.forEach(System.out::println);

        writeToFile(expensiveVehicles, "ExpensiveVehicles.txt");
    }

    public static void writeToFile(List<Vehicle> vehicles, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Vehicle v : vehicles) {
                writer.write(v.toString() + "\n");
            }
            System.out.println("Filtered data written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
