package section6.clases;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("commodpre")) {
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }
}
