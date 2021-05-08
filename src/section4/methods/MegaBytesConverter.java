package section4.methods;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int kilobytes =  kiloBytes % 1024;
        int megabytes = kiloBytes / 1024 ;

        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else if ( kiloBytes > 0){
            System.out.println( kiloBytes +" KB = " + megabytes + " MB and "+kilobytes+ " KB");
        }
    }
}
