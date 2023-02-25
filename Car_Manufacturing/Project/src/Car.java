public class Car {
    private CarMake make;
    private CarModel model;
    private BodyType bodyType;
    private EngineType engineType;
    private EngineCC engineCC;
    private String color;
    private Transmission transmission;
    private CarFeatures[] features;

    public Car(CarMake make, CarModel model, BodyType bodyType, EngineType engineType, EngineCC engineCC, String color, Transmission transmission, CarFeatures[] features) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.engineCC = engineCC;
        this.color = color;
        this.transmission = transmission;
        this.features = features;
    }

    public CarMake getMake() {
        return make;
    }

    public void setMake(CarMake make) {
        this.make = make;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineCC getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(EngineCC engineCC) {
        this.engineCC = engineCC;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public CarFeatures[] getFeatures() {
        return features;
    }

    public void setFeatures(CarFeatures[] features) {
        this.features = features;
    }

    
}
