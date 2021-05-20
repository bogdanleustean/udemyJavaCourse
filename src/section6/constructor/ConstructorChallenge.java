package section6.constructor;

public class ConstructorChallenge {
    private String name;
    private int cardLimit;
    private String email;


    public ConstructorChallenge(){
        this("default name", 50000, "defaultUser@.test.com ");
    }

    public ConstructorChallenge(String name, int cardLimit) {
        this(name, cardLimit, "unknown@email.com");
    }

    public ConstructorChallenge(String name, int cardLimit, String email) {
        this.name = name;
        this.cardLimit = cardLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public String getEmail() {
        return email;
    }
}
