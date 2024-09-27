package lesson_07;

import java.util.Scanner;

public class SelfTraining {
    public static void main(String[] args) {
        String day = "sunday";

        if (day.equals("monday")) {
            System.out.println("Good morning");
            System.out.println("Monday -> you go to study");
        } else if (day.equals("tuesday")) {
            System.out.println("Good morning");
            System.out.println("Tuesday -> you go to study");
        } else if (day.equals("wednesday")) {
            System.out.println("Good morning");
            System.out.println("Wednesday -> you go to study");
        } else if (day.equals("thursday")) {
            System.out.println("Good morning");
            System.out.println("Thursday -> you go to study");
        } else if (day.equals("friday")) {
            System.out.println("Goog morning");
            System.out.println("Friday -> you go to study");
        } else if (day.equals("saturday")) {
            System.out.println("Good morning");
            System.out.println("Saturday -> you go to the party");
        } else if (day.equals("sunday")) {
            System.out.println("Good morning");
            System.out.println("Sunday -> tou go to the pool");
        } else {
            System.out.println("false");
        }

        System.out.println("====================================================");

        switch (day) {
            case ("monday"):
                System.out.println("Good morning");
                System.out.println("Monday - you go to study");
                break;
            case ("tuesday"):
                System.out.println("Good morning");
                System.out.println("Tuesday - you go to study");
                break;
            case ("wednesday"):
                System.out.println("Good morning");
                System.out.println("Wednesday");
                break;
            case ("thursday"):
                System.out.println("Good morning");
                System.out.println("Thursday - you go to study");
                break;
            case ("friday"):
                System.out.println("Good morning");
                System.out.println("Friday - you go study");
                break;
            case ("saturday"):
                System.out.println("Good morning");
                System.out.println("Saturday - you go to the party");
                break;
            case ("sunday"):
                System.out.println("Good morning");
                System.out.println("Sunday - you go to the pool");
        }

        System.out.println("====================================================");

        // Weather

        String weather = "windy";

        if (weather.equals("sunny")) {
            System.out.println("The weather is sunny");
            System.out.println("You go out");
        } else if (weather.equals("rainy") | weather.equals("windy")) {
            System.out.println("The weather is rainy or windy");
            System.out.println("You stay at home");
        } else if (weather.equals("snowy")){
            System.out.println("The weather is snowy");
            System.out.println("You stay at home");
        } else {
            System.out.println("other");
            System.out.println("Wheater: " + weather);
        }

        System.out.println("====================================================");

        System.out.println("Enter any number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You entered -> " + digit);

        String text = "12345";
        int textLength = text.length();
        System.out.println("textLength: " + textLength);


}
}
