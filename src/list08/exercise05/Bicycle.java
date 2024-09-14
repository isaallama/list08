package list08.exercise03;

public class Bicycle implements TransportMeans {

    @Override
    public void accelerate() {
        System.out.println("The bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The bicycle is braking.");
    }
}
