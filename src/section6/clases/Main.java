package section6.clases;

public class Main {
    public static void main(String[] args) {
// test for git
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
      //  System.out.println("model is " +porsche.getModel());

        SumCalculatorChallenge calculator = new SumCalculatorChallenge();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);

        System.out.println("add = " + calculator.getAdditionalResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply = "+calculator.getMultiplicationResult());
        System.out.println("divide = "+calculator.getDivisionResult());

        System.out.println("------------------> person class ");
        Person person = new Person();
        person.setFirstName(" ");
        person.setLastName(" ");
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " +person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setLastName("smith");
        System.out.println("fullName = "+ person.getFullName());

    }
}
