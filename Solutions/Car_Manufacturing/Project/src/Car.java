import java.util.Arrays;

public class Car {
    private CarMake make = CarMake.AUDI;
    private CarModel model = CarModel.A4;
    private BodyType bodyType = BodyType.SEDAN;
    private EngineType engineType = EngineType.V4;
    private EngineCC engineCC = EngineCC.CC_1000;
    private String color = "RED";
    private Transmission transmission = Transmission.AUTO;
    private CarFeatures[] features = new CarFeatures[]{
        CarFeatures.ABS,
        CarFeatures.AIRBAGS,
        CarFeatures.AIR_CONDITIONING,
        CarFeatures.ALLOY_WHEELS,
        CarFeatures.CD_PLAYER,
        CarFeatures.ELECTRIC_WINDOWS,
        CarFeatures.POWER_STEERING,
        CarFeatures.SUNROOF
    };

    /**
     * @param make
     * @param model
     * @param bodyType
     * @param engineType
     * @param engineCC
     * @param color
     * @param transmission
     * @param features
     */
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

    /**
     * @return make of car
     */
    public CarMake getMake() {
        return make;
    }

    /**
     * @param make set make of car
     */
    public void setMake(CarMake make) {
        this.make = make;
    }

    /**
     * @param make
     * @return true if make of car is equal to make
     */
    public boolean isMake(CarMake make) {
        return this.make == make;
    }

    /**
     * @return model of car
     */
    public CarModel getModel() {
        return model;
    }

    /**
     * @param model set model of car
     */
    public void setModel(CarModel model) {
        this.model = model;
    }

    /**
     * @param model of car
     * @return true if model of car is equal to model
     */
    public boolean isModel(CarModel model) {
        return this.model == model;
    }

    /**
     * @return body type of car
     */
    public BodyType getBodyType() {
        return bodyType;
    }

    /**
     * @param bodyType set body type of car
     */
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * @param bodyType
     * @return true if body type of car is equal to bodyType
     */
    public boolean isBodyType(BodyType bodyType) {
        return this.bodyType == bodyType;
    }

    /**
     * @return engine type of car
     */
    public EngineType getEngineType() {
        return engineType;
    }

    /**
     * @param engineType set engine type of car
     */
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    /**
     * @param engineType of car
     * @return  true if engine type of car is equal to engineType
     */
    public boolean isEngineType(EngineType engineType) {
        return this.engineType == engineType;
    }

    /**
     * @return engine CC of car
     */
    public EngineCC getEngineCC() {
        return engineCC;
    }

    /**
     * @param engineCC
     */
    public void setEngineCC(EngineCC engineCC) {
        this.engineCC = engineCC;
    }

    /**
     * @param engineCC of car
     * @return true if engine CC of car is equal to engineCC
     */
    public boolean isEngineCC(EngineCC engineCC) {
        return this.engineCC == engineCC;
    }

    /**
     * @return color of car
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color set color of car
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param color
     * @return true if color of car is equal to color
     */
    public boolean isColor(String color) {
        return this.color.equals(color);
    }

    /**
     * @return transmission of car
     */
    public Transmission getTransmission() {
        return transmission;
    }

    /**
     * @param transmission set transmission of car
     */
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * @param transmission
     * @return true if transmission of car is equal to transmission
     */
    public boolean isTransmission(Transmission transmission) {
        return this.transmission == transmission;
    }

    /**
     * @return features of car
     */
    public CarFeatures[] getFeatures() {
        return features;
    }

    /**
     * @param features set features of car
     */
    public void setFeatures(CarFeatures[] features) {
        this.features = features;
    }

    /**
     * @param feature
     * @return true if car has feature
     */
    public boolean hasFeature(CarFeatures feature) {
        for (CarFeatures f : features) {
            if (f == feature) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String featuresString = "";
        for (CarFeatures f : features) {
            featuresString += f + ", ";
        }
        return "Car{" +
                "\n\t make = " + make +
                "\n\t model = " + model +
                "\n\t bodyType = " + bodyType +
                "\n\t engineType = " + engineType +
                "\n\t engineCC = " + engineCC +
                "\n\t color = '" + color + '\'' +
                "\n\t transmission = " + transmission +
                "\n\t features = " + featuresString +
                '}' + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((make == null) ? 0 : make.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((bodyType == null) ? 0 : bodyType.hashCode());
        result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
        result = prime * result + ((engineCC == null) ? 0 : engineCC.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((transmission == null) ? 0 : transmission.hashCode());
        result = prime * result + Arrays.hashCode(features);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (make != other.make)
            return false;
        if (model != other.model)
            return false;
        if (bodyType != other.bodyType)
            return false;
        if (engineType != other.engineType)
            return false;
        if (engineCC != other.engineCC)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (transmission != other.transmission)
            return false;
        if (!Arrays.equals(features, other.features))
            return false;
        return true;
    }
}
