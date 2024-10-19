package src.AttendanceCalculator;
public class Logic {
    int num; int den;
    float attendance;
    public Logic(int num, int den){
        this.num = num;
        this.den = den;
        this.attendance = ((float)num/den) * 100;
    }

    public void LecReq(){
        if (this.attendance>=75){
            System.out.println(STR."You already have \{this.attendance}% attendance!!");
        }
        else{
            System.out.println(STR."You have \{this.attendance}% attendance!!");
//            System.out.println("Nah bro!! you're cooked, dw tho i got you!!");
        }

        for(float i = 1; ; i++){
            attendance = ( (num + i) / (den + i) ) * 100;
            if(attendance>75){
                System.out.println(STR."You'll need to attend \{(int)i} more classes to get to 75%.");
                break;
            }
        }
    }



}
