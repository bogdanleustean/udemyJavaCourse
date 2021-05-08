package section3.firstLesson;

import java.util.Scanner;

public class MainLesson1 {
    public static void main(String[] args) {
      /*
        System.out.println("hello world");
        int myFirstNumber = 5;
        int mySecondNumber =12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("numarul meu este -> " + myFirstNumber);
         int myLastOne = 1000- myTotal;
        System.out.println(myLastOne);
    */
        System.out.println(last2Letters(" "));
    }
  public static String last2Letters( String word){
       String newString = null;
      Scanner scan = new Scanner( System.in);
      System.out.println("tell me a word");
      word =scan.nextLine();

      for(int i = 0 ; i < word.length()-1; i++){
          newString = word.charAt(word.length()-2) + " " + word.charAt(word.length()-1);
      }
     return newString;
    }


}
