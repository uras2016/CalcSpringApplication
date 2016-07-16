package ua.goit.java;

import java.util.Scanner;

public class Console {

    private static Scanner consoleReader;

    public static String readString(String welcomeMessage) {
        System.out.println(welcomeMessage);
        consoleReader = new Scanner(System.in);
        String result = consoleReader.nextLine();
        return result;
    }


}
