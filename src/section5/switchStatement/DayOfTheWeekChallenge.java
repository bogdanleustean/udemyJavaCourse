        package section5.switchStatement;
        public class DayOfTheWeekChallenge {
            public static void main(String[] args) {
                printDayOfTheWeek(0);
                printDayOfTheWeek(1);
                printDayOfTheWeek(2);
                printDayOfTheWeek(4);
                printDayOfTheWeek(8);
                printAgainTheDayOfTheWeek(2);
                printAgainTheDayOfTheWeek(9);
            }
          public static void printDayOfTheWeek( int day){
                switch (day){
                    case 0:
                        System.out.println("today is monday");
                        break;
                    case 1:
                        System.out.println("today is tuesday");
                        break;
                    case 2:
                        System.out.println("today is wednesday");
                        break;
                    case 3:
                        System.out.println("today is thursday");
                        break;
                    case 4:
                        System.out.println("today is friday");
                        break;
                    case 5:
                        System.out.println("today is saturday");
                        break;
                    case 6:
                        System.out.println("today is sunday");
                        break;
                    default :
                        System.out.println("invalid day switch");
                        break;
                }
            }
                public static void printAgainTheDayOfTheWeek(int daySecondMethod){
                    if( daySecondMethod == 0){
                        System.out.println("monday");
                    } else if ( daySecondMethod == 1){
                        System.out.println("tuesday");
                    } else if ( daySecondMethod == 2){
                         System.out.println("wednesday");
                    }    else if ( daySecondMethod == 3){
                        System.out.println("thursday");
                    }    else if ( daySecondMethod == 4){
                        System.out.println("friday");
                    }     else if ( daySecondMethod == 5){
                        System.out.println("saturday");
                    }    else if ( daySecondMethod == 6){
                        System.out.println("sunday");
                    } else{
                        System.out.println(" not a good day");
                    }
                }
        }
