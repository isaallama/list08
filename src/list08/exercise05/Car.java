package list08.exercise03;

public class Car implements TransportMeans {

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking.");
    }
}
