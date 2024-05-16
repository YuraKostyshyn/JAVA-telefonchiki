import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Device[] devices = {
                new telephone("Xiaomi", "Mega228", 5000, 2221, "ultraviolet", true, 4.5),
                new tablet("Samsung", "A15", 12000, 2021, "blue", true, 5.5),
                new telephone("Xiaomi", "MI7", 5500, 2010, "ultragreen", true, 5.5),
                new laptop("HP", "Pavilion gaming 15", 52500, 2024, "Black", true, 1080.60)
        };

        for (Device device : devices) {
            device.displayInfo();
            System.out.println();
            if (device instanceof telephone) {
                telephone telephone = (telephone) device;
                telephone.measureRadiationLevel(40.7128, -74.0060);
                telephone.enableCounterfeitDetectionMode(1);
                telephone.analyzeVoiceMood("I am happy", "English");
            } else if (device instanceof tablet) {
                tablet tablet = (tablet) device;
                tablet.readEBooks();
                tablet.launchGraphicsEditor();
            } else if (device instanceof laptop) {
                laptop laptop = (laptop) device;
                laptop.runVirtualMachine();
                laptop.compileCode();
                laptop.editVideos();
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть марку пристрою: ");
        String brand = scanner.nextLine();

        boolean found = false;
        for (Device device : devices) {
            if (device instanceof telephone && device.getVyrobnyk().equalsIgnoreCase(brand)) {
                device.displayInfo();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Телефони з маркою " + brand + " не знайдено.");
        }

        scanner.close();
    }
}
