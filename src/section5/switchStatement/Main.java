package section5.switchStatement;

public class Main {
    public static void main(String[] args) {

//       int value = 1;
//        if(value == 1){
//            System.out.println("value is 1");
//        } else if(value == 2){
//            System.out.println("value is 2");
//        } else {
//            System.out.println("value is not 1 or 2");
//        }

        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("values for switch is 1");
               break;
            case 2:
                System.out.println("value for switch is 2");
               break;
            case 3: case 4: case 5:
                System.out.println("value is 3, or 4, or 5");
                System.out.println("actually it was a " + switchValue);
               break;
            default:
                System.out.println("value not 1 or 2");
                break;
        }
    }
}
