package jar;

import java.util.Scanner;

/*
*TIME CONVERSION:
*A program to convert and print the entered time in 24-hour format(military time)
*Entered time is in 12-hour clock format , (ie.: hh:mm AM or hh:mm PM).
*/

public class TimeConversion {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        do{
            System.out.println("Please input time in hh:mm am or hh:mm pm format:");
            String time = scanner.nextLine();
            if(time.equals("q")){
                break;
            }
        String result = timeConversion(time);
        System.out.println("Converted Time:"+result);

        System.out.println(); 
            
        }while(true);
        System.out.println("Exiting....");
        scanner.close();
    }

    public static String timeConversion(String time)
    {
    
    String splitTimeArray[] = time.split("[: ]");      
    String hour = splitTimeArray[0];
    String minute = splitTimeArray[1];
    String ampm = splitTimeArray[2];
    String convertedTime = "";

    if(hour.equals("12") && ampm.equalsIgnoreCase("am")){
        hour = "00";
        convertedTime = hour.concat(":").concat(minute);
    }

    else if(Integer.parseInt(hour)<12 && ampm.equalsIgnoreCase("pm")){
        int h = Integer.parseInt(hour);
        h = h + 12 ;
        hour = String.valueOf(h);
        convertedTime = hour.concat(":").concat(minute);
    }
    else if(Integer.parseInt(hour)>12 || Integer.parseInt(minute)>59 || Integer.parseInt(minute)<0){
        convertedTime = " Entered time is not valid. Please enter a valid 12 hour clock format";
    }
    else {
        convertedTime = hour.concat(":").concat(minute);
    }

   return convertedTime;

}

}