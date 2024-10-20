package src;
import src.AttendanceCalculator.Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputting attendance values
        int num; int den;




        public void getAttendance(){
        //inputting values
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your numerator: ");
            num = scan.nextInt();
            System.out.print("Please enter your denominator: ");
            den = scan.nextInt();
            scan.close();
        }


        //checking if numbers are valid
        if(num>den){
            System.out.println("Invalid numbers!!");
            getAttendance();
        }

        Logic logic = new Logic(num, den);
        logic.LecReq();
    }
}
