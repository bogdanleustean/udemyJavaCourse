package section7.encapsulation;

public class EncChanllangeMain {
    public static void main(String[] args) {
        EncapsulationChallenge printer = new EncapsulationChallenge(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("printed was "+pagesPrinted + " new total print count for printer = "
        + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("printed was "+pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
    }
}
