package exercisesoop;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBuses {
    public static void main(String[] args) {
        ArrayList<InnerCityTrip> innerCityTripArrayList = new ArrayList<>();
        ArrayList<SuburbanTrip> suburbanTripArrayList = new ArrayList<>();
        int numberOfInnerCityTrip = 0;
        int numberOfSuburbanTrip = 0;
        double turnoverOfInnerCityTrip = 0;
        double turnoverOfSuburbanTrip = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the inner city bus: ");
        numberOfInnerCityTrip = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the number of out-of-town bus trips: ");
        numberOfSuburbanTrip = scanner.nextInt();

        System.out.println("Enter the information of the inner city bus :");
        for (int i = 0; i < numberOfInnerCityTrip; i++) {
            System.out.println("Enter the information of the second bus " + (i + 1) + ":");
            InnerCityTrip innerCityTrip = new InnerCityTrip();
            innerCityTrip.inputInnerCityTrip();
            turnoverOfInnerCityTrip += innerCityTrip.getTurnover();
            innerCityTripArrayList.add(innerCityTrip);
        }

        System.out.println("Enter the information of the out-of-town bus :");
        for (int i = 0; i < numberOfSuburbanTrip; i++) {
            System.out.println("Enter the information of the second bus " + (i + 1) + ":");
            SuburbanTrip suburbanTrip = new SuburbanTrip();
            suburbanTrip.inputSuburbanTrip();
            turnoverOfSuburbanTrip += suburbanTrip.getTurnover();
            suburbanTripArrayList.add(suburbanTrip);
        }

        System.out.println("**Information about the inner city bus**");
        for (int i = 0; i < innerCityTripArrayList.size(); i++) {
            System.out.println(innerCityTripArrayList.get(i).toString());
        }

        System.out.println("");
        System.out.println("**Information about out-of-town bus trips**");
        for (int i = 0; i < suburbanTripArrayList.size(); i++) {
            System.out.println(suburbanTripArrayList.get(i).toString());
        }

        System.out.println("Revenue per ride : ");
        System.out.println("Revenue from inner city bus trips : " + turnoverOfInnerCityTrip);
        System.out.println("Out-of-town bus revenue : " + turnoverOfSuburbanTrip);
    }
}
