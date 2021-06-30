package section7.composition;

public class BedroomCompositionChallenge {
    private String name;
    private WallCompositionChallenge wall1;
    private WallCompositionChallenge wall2;
    private WallCompositionChallenge wall3;
    private WallCompositionChallenge wall4;
    private CeilingCompositionChallenge ceiling;
    private BedCompositionChallenge bed;
    private LampCompositionChallenge lamp;

    public BedroomCompositionChallenge(String name, WallCompositionChallenge wall1, WallCompositionChallenge wall2, WallCompositionChallenge wall3, WallCompositionChallenge wall4, CeilingCompositionChallenge ceiling, BedCompositionChallenge bed, LampCompositionChallenge lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public LampCompositionChallenge getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> making bed");
        bed.make();
    }
}
