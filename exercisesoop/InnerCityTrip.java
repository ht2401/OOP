package exercisesoop;

public class InnerCityTrip extends Buses {
    private String lineNumber;
    private double lineLength;

    public InnerCityTrip() {
    }

    public InnerCityTrip(String lineNumber, double lineLength) {
        this.lineNumber = lineNumber;
        this.lineLength = lineLength;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public double getLineLength() {
        return lineLength;
    }

    public void setLineLength(double lineLength) {
        this.lineLength = lineLength;
    }

    public void inputInnerCityTrip() {
        super.input();
        System.out.println("Enter the number of trips of the inner city bus : ");
        lineNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the number of kilometers traveled : ");
        lineLength = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + ", lineNumber: " + this.lineNumber +
                ", lineLength: " + this.lineLength;
    }
}
