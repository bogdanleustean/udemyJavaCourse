package section7.composition;

public class CompositionChallenge {
    public static void main(String[] args) {

        WallCompositionChallenge wall1= new WallCompositionChallenge("West");
        WallCompositionChallenge wall2= new WallCompositionChallenge("East");
        WallCompositionChallenge wall3= new WallCompositionChallenge("South");
        WallCompositionChallenge wall4= new WallCompositionChallenge("North");

        CeilingCompositionChallenge ceiling = new CeilingCompositionChallenge(12,55);

        BedCompositionChallenge bed = new BedCompositionChallenge("modern",2,60,2,1);

        LampCompositionChallenge lamp = new LampCompositionChallenge("classic", false,75);

        BedroomCompositionChallenge bedRoom = new BedroomCompositionChallenge("Tims", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
