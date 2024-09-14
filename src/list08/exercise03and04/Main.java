package list08.exercise02;

public class Main {
    public static void main(String[] args) {
        // Creating Employee references and instantiating specific types
        Employee manager = new Manager("Henrique", 6000.00);
        Employee developer = new Developer("Sarah", 3500.00);

        // Display information
        System.out.println(manager);
        System.out.println(developer);

        manager.work();
        developer.work();
    }
}
