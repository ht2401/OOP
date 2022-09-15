package exercisesoop;

public class SuburbanTrip extends Buses {
    private String destination;
    private int numberOfDays;

    public SuburbanTrip() {

    }

    public SuburbanTrip(String destination, int numberOfDays) {
        this.destination = destination;
        this.numberOfDays = numberOfDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void inputSuburbanTrip() {
        super.input();
        System.out.println("Enter destination : ");
        destination = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the number of days to travel");
        numberOfDays = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + ", destination: " + this.destination +
                ", numberOfDays: " + this.numberOfDays;
    }
}
