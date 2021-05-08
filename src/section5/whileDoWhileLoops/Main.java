package section5.whileDoWhileLoops;

public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 5){
//            System.out.println("count is "+count);
//            count++;
//        }
//    count = 1;
//        while (true){
//            if(count==5){
//                break;
//            }
//            System.out.println("count value is "+ count);
//            count++;
//        }
//        count =1;
//        // do while is executing at least 1
//        do {
//            System.out.println("do was "+count);
//        } while (count != 6);


//        int number = 4;
//        int finishNum = 20;
//        while (number <= finishNum){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("even number " + number);
//        }
        int number = 4;
        int finishNum = 20;
        int evenNumbers = 0;
        while (number <= finishNum){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number " + number);
            evenNumbers++;
            if(evenNumbers >=5){
                break;
            }
        }
        System.out.println("total even numbers " +evenNumbers);
    }
   public static boolean isEvenNumber(int number){
        return number % 2 == 0;
   }
}
