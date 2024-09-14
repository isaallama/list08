package list08.exercise02;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public abstract double calculateBonus();


    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}



