/* Name: Emory Moore
# Date: 4/18/2023
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description: Palindromes is a simulation of an airline website. It allows users to create an account and book flights.
It also has a method to determine whether or not the user's password is a palindrome.
# Input: The user types their account name, password, date of birth and pin. The user also types commands for one of the five
options listed. Based off the option they choose, the user will either book a flight, view their ticket, view all flights,
change their password, or quit the program.
# Output:The program will display the account and flight information as well as whether or not the user's password is a palindrome.
*/

public class Account {
    //The user's name
    public String name;

    //The user's birthday
    public char date;

    //The user's account pin
    public int pin;

    //The user's account password
    public String password;


    //The mutator methods for the account information.
    public void setName(String newName){
        name= newName;
    }

    public void setDate(char newDate){
        date= newDate;
    }

    public void setPin(int newPin){
        pin=newPin;
    }

    public void setPassword(String newPassword){
        password=newPassword;
    }


    //The accessor methods for the account information.
    public String getName(){
        return name;
    }

    public char getDate(){
        return date;
    }

    public int getPin(){
        return pin;
    }

    public String getPassword(){
        return password;
    }

    //Checks if the user's password is a palindrome.
    public void checkPalindrome(String thePassword){
        String reverse=" ";
        char c;

        for (int i=0; i< thePassword.length(); i++){
            c= thePassword.charAt(i);
            reverse = c + reverse;
        }

        if (thePassword.compareTo(reverse) == -1 || thePassword.compareTo(reverse) == 1){
            System.out.println("Your password is a palindrome.");

        } else {
            System.out.println("Your password is not a palindrome.");
        }
    }
}
