package list08.exercise02;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Manager, Bonus: " + calculateBonus();
    }
}


