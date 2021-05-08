package section5.whileDoWhileLoops;

public class FlourPackChallenge {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(1,0,4));

    }
   public static boolean canPack( int bigCount, int smallCount, int goal){
      if( bigCount < 0 || smallCount < 0 || goal < 0){
          return false;
      }
       bigCount *=5;
               while( bigCount > goal){
                   bigCount -=5;
               }
         return bigCount + smallCount >= goal || smallCount >= goal;
    }
}
