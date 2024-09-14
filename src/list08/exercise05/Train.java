package list08.exercise03;

public class Train implements TransportMeans {

    @Override
    public void accelerate() {
        System.out.println("The train is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The train is braking.");
    }
}

