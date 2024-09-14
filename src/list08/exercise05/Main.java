package list08.exercise03;

public class Main {
    public static void main(String[] args) {
        // Create an array of ITransport
        TransportMeans[] transportMeans = new TransportMeans[3];

        // Instantiate objects and add them to the array
        transportMeans[0] = new Car();
        transportMeans[1] = new Bicycle();
        transportMeans[2] = new Train();

        // Iterate through the array and call accelerate() and brake() methods
        for (TransportMeans transport : transportMeans) {
            transport.accelerate();
            transport.brake();
        }
    }
}

