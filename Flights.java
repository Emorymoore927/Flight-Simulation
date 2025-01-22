import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Flights {

    //Array that will hold the list of flights.
    ArrayList<String> flights = new ArrayList<>();

    //Array that stores flights from the file
    ArrayList<String> newFlights= new ArrayList<>();


    //Adding the flights to the array then printing out the array.
    public void viewFlights(){ //add return times
        flights.add("1. Tallahassee to New York- DELTA - 11:00 AM to 7:30 PM - $250" );
        flights.add("2. Juno to Milwaukee - UNITED - 11:00 AM to 9:00 PM - $175");
        flights.add("3. Tuscon to Nashville - SOUTHWEST - 12:00 PM to 5:00 PM - $300");
        flights.add("4. Branson to Arlen - UNITED - 2:00 PM to 4:00 PM - $225");
        flights.add("5. Atlanta to Chicago - DELTA - 2:00 PM to 4:00 PM - $375");
        flights.add("6. Atlanta to San Francisco - NORTHWEST - 2:15 PM to 8:15 PM - $250");
        System.out.println(flights);
    }

    public void readFlights() throws Exception {
        Scanner scan;
        scan= new Scanner(new File("H:\\My Drive\\emory.moore@pop.belmont.edu 2022-11-02 23 57\\Belmont\\Sophomore\\Second Semester\\Programming II\\PalindromesProject\\Flights.txt"));
        int count= 0;

        while (scan.hasNext()==true){
            newFlights.add(scan.nextLine());
            count++;
        }

        System.out.println(newFlights);
    }
}
