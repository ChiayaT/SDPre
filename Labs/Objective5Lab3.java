import java.util.Scanner;
public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner canner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");

      userNum = canner.nextInt();
      if (userNum > 0){
        System.out.println("The number is positive");
      }
      else if (userNum == 0){
        System.out.println("The number is 0");
      }
      else{
        System.out.println("The number is negative");
      }
      canner.close();
  }
}