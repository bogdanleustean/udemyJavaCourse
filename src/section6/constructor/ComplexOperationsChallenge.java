package section6.constructor;

public class ComplexOperationsChallenge {
    private double imaginary;
    private double real;

    public ComplexOperationsChallenge(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public void add(double real, double imaginary){
        this.real=this.real+real;
        this.imaginary=this.imaginary+imaginary;
    }

    public void add(ComplexOperationsChallenge complexNumber){
        this.real=this.real+complexNumber.real;
        this.imaginary=this.imaginary+complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real=this.real-real;
        this.imaginary=this.imaginary-imaginary;
    }

    public void subtract(ComplexOperationsChallenge complexNumber){
        this.real=this.real-complexNumber.real;
        this.imaginary=this.imaginary-complexNumber.imaginary;
    }

    public static void main(String[] args) {
        ComplexOperationsChallenge one = new ComplexOperationsChallenge(1.0, 1.0);
        ComplexOperationsChallenge number = new ComplexOperationsChallenge(2.5, -1.5);

        one.add(1,1);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = "+ one.getImaginary());

        one.subtract(number);
        System.out.println(" one new real = " + one.getReal());
        System.out.println(" one new imaginary = "+ one.getImaginary());

        number.subtract(one);
        System.out.println("number real = "+ number.getReal());
        System.out.println("number imagianry = " + number.getImaginary());

    }
}
