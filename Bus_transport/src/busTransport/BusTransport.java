package busTransport;

import java.util.Scanner;

class Bus {
    private String busNumber;
    private String route;
    private int capacity;
    private double fare;
    private BusTiming busTiming;

    public Bus(String busNumber, String route, int capacity, double fare, BusTiming busTiming) {
        this.busNumber = busNumber;
        this.route = route;
        this.capacity = capacity;
        this.fare = fare;
        this.busTiming = busTiming;
    }

    public void displayDetails() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + route);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println("Fare: $" + fare);
        System.out.println("Bus Timings:");
        busTiming.displayTimings();
    }
}

class BusTiming {
    private String[] weekdays;
    private String[] weekends;

    public BusTiming(String[] weekdays, String[] weekends) {
        this.weekdays = weekdays;
        this.weekends = weekends;
    }

    public void displayTimings() {
        System.out.println("Weekdays Timings:");
        for (String timing : weekdays) {
            System.out.println(timing);
        }
        System.out.println("Weekends Timings:");
        for (String timing : weekends) {
            System.out.println(timing);
        }
    }
}

class BusStop {
    private String stopName;
    private String stopLocation;

    public BusStop(String stopName, String stopLocation) {
        this.stopName = stopName;
        this.stopLocation = stopLocation;
    }

    public void displayStopDetails() {
        System.out.println("Stop Name: " + stopName);
        System.out.println("Stop Location: " + stopLocation);
    }
}


public class BusTransport {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Bus Number:");
        String busNumber = scanner.nextLine();

        System.out.println("Enter Route:");
        String route = scanner.nextLine();

        System.out.println("Enter Capacity:");
        int capacity = scanner.nextInt();

        System.out.println("Enter Fare:");
        double fare = scanner.nextDouble();

        System.out.println("Enter Weekdays Bus Timings (comma-separated):");
        String[] weekdaysTimings = scanner.next().split(",");

        System.out.println("Enter Weekends Bus Timings (comma-separated):");
        String[] weekendsTimings = scanner.next().split(",");

        BusTiming busTiming = new BusTiming(weekdaysTimings, weekendsTimings);

        System.out.println("Enter Bus Stop Details:");
        System.out.println("Enter Stop Name:");
        String stopName = scanner.next();

        System.out.println("Enter Stop Location:");
        String stopLocation = scanner.next();

        BusStop busStop = new BusStop(stopName, stopLocation);

        Bus bus = new Bus(busNumber, route, capacity, fare, busTiming);

        System.out.println("\nBus Details:");
        bus.displayDetails();

        System.out.println("\nBus Stop Details:");
        busStop.displayStopDetails();

        scanner.close();
	}

}
