package section7.composition;

public class CompositionClass {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        
        Case theCase = new Case("220B","Dell", "240", dimensions );

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2550, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,"2.44");

        PC thePC = new PC(theCase,theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("windows 1.0");
//        thePC.getTheCase().pressPowerButton();

         thePC.powerUp();


    }
}
