package section4.methodOverloading;

public class AreaCalculatorChallenge {
    private static double PI = 3.141592653589793238;

    public static void main(String[] args) {
        System.out.println(" aria cercului "+area(5.0));
        System.out.println(area(-1));
        System.out.println("aria  patrulaterului " +area(5.4, 4.0));
        System.out.println(area(-1.0,4.0));
    }
     public static double area(double radius){
        if( radius < 0){
            return -1;
        }
        return radius * radius * PI;
     }

      public static double area( double x, double y){
        if ((x < 0) || (y < 0)){
            return -1;
          }
          return x * y;
      }
}

