package exercisesoop;

import java.util.Scanner;

public class Buses {
    private String flightCode;
    private String driverName;
    private String vehicleNumber;
    private double turnover;

    Scanner scanner = new Scanner(System.in);

    public Buses() {
    }

    public Buses(String flightCode, String driverName, String vehicleNumber, double turnover) {
        this.flightCode = flightCode;
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
        this.turnover = turnover;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public void input() {
        System.out.println("Enter the flight number : ");
        flightCode = scanner.nextLine();
        System.out.println("Enter driver's name : ");
        driverName = scanner.nextLine();
        System.out.println("Enter license plate number : ");
        vehicleNumber = scanner.nextLine();
        System.out.println("Enter revenue : ");
        turnover = scanner.nextInt();
    }

    public String toString() {
        return "flightCode: " + this.flightCode +
                ", driverName: " + this.driverName +
                ", vehicleNumber: " + this.vehicleNumber +
                ", turnover: " + this.turnover;
    }
}
