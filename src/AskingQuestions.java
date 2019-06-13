import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;
public class AskingQuestions {

    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int num1, num2;
      System.out.println("First number? ");
      num1 = keyboard.nextInt();
        System.out.println("Second number? ");
        num2= keyboard.nextInt();
        System.out.println(" The largest one is : " +  Math.max(num1,num2));
        System.out.println(" Average of two : " + num1/num2);


    }
}
