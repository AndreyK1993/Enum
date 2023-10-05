package e_num;

import java.util.Scanner;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter one of RED, YELLOW, GREEN: ");

        String input = scanner.nextLine().toUpperCase();

        TrafficLight col;

        try {
            col = TrafficLight.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color input.");
            return;
        }

        if (col == TrafficLight.RED) {
            System.out.println("STOP");
        } else if (col == TrafficLight.YELLOW) {
            System.out.println("Get Ready");
        } else {
            System.out.println("Go!!!");
        }
    }
}
