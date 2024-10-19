package src;
import src.AttendanceCalculator.Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputting attendance values
        int num; int den;

        Scanner scan = new Scanner(System.in);


        //inputting values
        System.out.print("Please enter your numerator: ");
        num = scan.nextInt();
        System.out.print("Please enter your denominator: ");
        den = scan.nextInt();
        scan.close();

        Logic logic = new Logic(num, den);
        logic.LecReq();
    }
}
