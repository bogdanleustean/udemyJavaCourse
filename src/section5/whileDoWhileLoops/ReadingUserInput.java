package section5.whileDoWhileLoops;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();// handle next line character ( enter key)
            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if(age>=0 && age<= 100){
                System.out.println("your name is -> "+ name +", and you are "
                        + age + " years old");
            }
            else{
                System.out.println("invalid year of birth");
            }
        }
        else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
