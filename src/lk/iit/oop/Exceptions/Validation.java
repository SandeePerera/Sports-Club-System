package lk.iit.oop.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    public static String usernameValidation(Scanner in) {     //User input validation
        while (true) {                                      //while loop to run continuously if the input is wrong
            try {
                String userIn = in.nextLine();
                if (!userIn.matches("user")) {        //regular expression to validate through numbers
                    System.out.println("Wrong User Name! Re enter correct one");

                } else if (userIn.length() == 0) {     //checking whether user input is empty
                    System.out.println("You need to enter a value (not Blank), Enter Again: ");

                } else {
                    return userIn;
                }

            } catch (Exception e) {     //handliing exception
                numValidation(in);
            }
        }
    }

    public static String passwordValidation(Scanner in) {     //User input validation
        while (true) {                                      //while loop to run continuously if the input is wrong
            try {
                String userIn = in.nextLine();
                if (!userIn.matches("123")) {        //regular expression to validate through numbers
                    System.out.println("Wrong Password! Re enter correct one");

                } else if (userIn.length() == 0) {     //checking whether user input is empty
                    System.out.println("You need to enter a value (not Blank), Enter Again: ");

                } else {
                    return userIn;
                }

            } catch (Exception e) {     //handliing exception
                numValidation(in);
            }
        }
    }

    public static String stringValidation(Scanner in) {     //String input validation
        while (true) {                                      //while loop to run continuously if the input is wrong
            try {
                String userIn = in.nextLine();
                if (!userIn.matches("[a-zA-Z ]+")) {        //regular expression to validate through numbers
                    System.out.println("Not a valid value..Enter again using only letters!");

                } else if (userIn.length() == 0) {     //checking whether user input is empty
                    System.out.println("You need to enter a value (not Blank), Enter Again: ");

                } else {
                    return userIn;
                }

            } catch (Exception e) {     //handliing exception
                numValidation(in);
            }
        }
    }


    public static String numValidation(Scanner in) {         //validation of integer numbers
        while (true) {
            try {
                String userIn = in.nextLine();
                if (userIn.matches("[^0-9]+")) {    //validation to only allow numbers using REGEX
                    System.out.println("Not a valid value..Enter again using only Numbers!");

                } else if (userIn.length() == 0) {         //checking the length of the input
                    System.out.println("You need to enter a value (not Blank), Enter Again: ");

                } else {
                    return userIn;
                }

            } catch (Exception e) {
                numValidation(in);
            }
        }
    }


    public static String typeValidation(Scanner in) {     //String input validation
        while (true) {                                      //while loop to run continuously if the input is wrong
            try {
                String userIn = in.nextLine();
                if (!userIn.matches("[a-cA-C ]+")) {        //regular expression to validate through numbers
                    System.out.println("Not a valid value..Enter again using only letters!");

                } else if (userIn.length() == 0) {     //checking whether user input is empty
                    System.out.println("You need to enter a value (not Blank), Enter Again: ");

                } else {
                    return userIn;
                }

            } catch (Exception e) {     //handliing exception
                numValidation(in);
            }
        }
    }

}
