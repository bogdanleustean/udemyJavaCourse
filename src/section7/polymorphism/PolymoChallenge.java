package section7.polymorphism;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
        public String startEngine(){
            return "start engine in car class";
        }

        public String accelerate(){
            return "let's accelerate in car class";
        }

        public String brake(){
           return " brake in car class";
        }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return "start engine in ford class";
    }


    @Override
    public String accelerate(){
        return "let's accelerate in ford class";
    }

 @Override
    public String brake(){
        return " brake in ford class";
    }
}

class VW extends Car{
    public VW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return "start engine in VW class";
    }


    @Override
    public String accelerate(){
        return "let's accelerate in VW class";
    }

    @Override
    public String brake(){
        return " brake in VW class";
    }
}

class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return "start engine in Toyota class";
    }


    @Override
    public String accelerate(){
        return "let's accelerate in Toyota class";
    }

    @Override
    public String brake(){
        return " brake in Toyota class";
    }
}

public class PolymoChallenge {
    public static void main(String[] args) {

        Car car = new Car("Dacia",3);
        Ford ford = new Ford("ford class", 6);
        VW vw = new VW("VW class", 7);
        Toyota toyota = new Toyota("Toyota class", 8);

        System.out.println(ford.getName());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.getCylinders());
        System.out.println(ford.startEngine());

    }
}
