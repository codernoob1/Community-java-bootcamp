package Switch;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Enter valid fruit");

//        }
        int day = in.nextInt();

//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("Enter valid number");
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Workday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid input");
        }
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Workday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
    }
}