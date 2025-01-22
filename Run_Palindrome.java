import java.util.Scanner;

public class Run_Palindrome {

    //Static variable that allows the user to choose options
    static int scan;

    //Holds the flight the user selects.
    static int flight;

    //Displays the user's options
    public static void menu(){
        Scanner s= new Scanner(System.in);
        System.out.print("Options:\n");
        System.out.println("1. View available flights.\n" +
                "2. Book a ticket.\n" +
                "3. View your ticket.\n" +
                "4. Change password.\n" +
                "5. View more avaiable flights. \n" +
                "6. Quit\n");
        System.out.println("SELECT OPTION (1-10): ");
        scan = s.nextInt();
    }

    public static void main(String[] args) throws Exception {

        Account a= new Account();
        Flights f= new Flights();
        Scanner s= new Scanner(System.in);

        System.out.println("________________________________________");
        System.out.println("\t Belmont's Airlines Corporation");
        System.out.println("________________________________________");

        System.out.println("Enter the account name:");
        String name= s.nextLine();


        System.out.println("\n Enter the account password:");
        String pass= s.nextLine();


        System.out.println("\n Enter the user's 6 digit birthday(month day year):");
        int birth= s.nextInt();
        int birthDigit = (int)(Math.log10(birth)+1);

        if (birthDigit != 6){
            System.out.println("Enter a valid birthday.");
            birth= s.nextInt();
        }


        System.out.println("\n Enter the 4 digit account pin");
        int pin= s.nextInt();
        int length = (int)(Math.log10(pin)+1);

        if (length != 4){
            System.out.println("Enter a valid account pin.");
            pin= s.nextInt();
        }


        //Displaying the user's airline account
        System.out.println("\n"+ name+ "'s Account details:");
        System.out.println("\t Birthday: " + birth);
        System.out.println("\t Password: " + pass);
        System.out.println("\t Pin: " + pin);

        a.checkPalindrome(pass);

        System.out.println("____________________________________________");
        menu();

        while (scan!=6){
            switch (scan){
                case 1:
                    f.viewFlights();
                    menu();
                    break;

                case 2:
                    System.out.println("Select a flight: ");
                    f.viewFlights();
                    f.readFlights();
                    flight= s.nextInt();
                    menu();
                    break;

                case 3:
                    if (flight==1){
                        System.out.println("1. Tallahassee to New York- DELTA - 11:00 AM");
                    }

                    if (flight ==2){
                        System.out.println("2. Juno to Milwaukee - UNITED - 11:00 AM");
                    }

                    if (flight==3){
                        System.out.println("Tuscon to Nashville - SOUTHWEST - 12:00 PM");
                    }

                    if (flight==4){
                        System.out.println("Branson to Arlen - UNITED - 2:00 PM");
                    }

                    if (flight==5){
                        System.out.println("Atlanta to Chicago - DELTA - 2:00 PM");
                    }

                    if (flight==6){
                        System.out.println("Atlanta to San Francisco - NORTHWEST - 2:15 PM");
                    }

                    if (flight==7){
                        System.out.println("BNA to FLL - SPIRIT - 5:10 AM to 8:12 AM - $84");

                    }

                    if (flight==8){
                        System.out.println("BNA to MIA - JETBLUE - 7:45 PM to 10:59 PM - $168");

                    }

                    if (flight==9){
                        System.out.println("ATL to LGA - DELTA - 10:00 AM to 12:19 PM - $229");

                    }

                    if (flight==10){
                        System.out.println("ATL to EWR - DELTA - 1:55 PM to 4:04 PM - $379");

                    }

                    if (flight==11){
                        System.out.println("ATL to JFK - JETBLUE - 11:39 AM to 2:00 PM - $509");
                    }

                    menu();
                    break;

                case 4:
                    System.out.println("Enter new password: ");
                    a.setName(s.nextLine());
                    a.checkPalindrome(s.nextLine());
                    menu();
                    break;

                case 5:
                    f.readFlights();
                    menu();
                    break;
            }
        }

    }
}
