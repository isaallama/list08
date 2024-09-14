package list08.exercise02;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    @Override
    public void work() {
        System.out.println(name + " is developing software.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Developer, Bonus: " + calculateBonus();
    }
}


