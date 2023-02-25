import java.util.ArrayList;

public class CarInventoryList {
    private ArrayList<Car> cars;

    /**
     *  Constructor for CarInventoryList class 
     *  Creates an ArrayList of Car objects
     */
    public CarInventoryList() {
        cars = new ArrayList<Car>();   
    }

    
    /**
     * @param cars
     *  Constructor for CarInventoryList class 
     *  Creates an ArrayList of Car objects
     */
    public CarInventoryList(ArrayList<Car> cars) {
        this.cars = cars;
    }

    /**
     * @param car add car to inventory
     *  Adds a car to the ArrayList of cars
     *  @return void
     */
    public void addCar(Car car) {
        cars.add(car);
        
    }

    /**
     *  Prints the inventory of cars
     *  @return void
     *  @param void
     */
    public void printInventory() {
        for(Car car: cars) {
            System.out.println(car);
        }
    }

    /**
     * @param make
     * Prints the inventory of cars by make
     * @return void
     */
    public void printInventoryByMake(CarMake make) {
        for(Car car: cars) {
            if(car.isMake(make)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param model
     * Prints the inventory of cars by model
     */
    public void printInventoryByModel(CarModel model) {
        for(Car car: cars) {
            if(car.isModel(model)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param bodyType
     * Prints the inventory of cars by body type
     */
    public void printInventoryByBodyType(BodyType bodyType) {
        for(Car car: cars) {
            if(car.isBodyType(bodyType)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param engineType
     * Prints the inventory of cars by engine type
     */
    public void printInventoryByEngineType(EngineType engineType) {
        for(Car car: cars) {
            if(car.isEngineType(engineType)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param engineCC
     * Prints the inventory of cars by engine CC
     */
    public void printInventoryByEngineCC(EngineCC engineCC) {
        for(Car car: cars) {
            if(car.isEngineCC(engineCC)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param color
     * Prints the inventory of cars by color
     */
    public void printInventoryByColor(String color) {
        for(Car car: cars) {
            if(car.isColor(color)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param transmission
     * Prints the inventory of cars by transmission
     */
    public void printInventoryByTransmission(Transmission transmission) {
        for(Car car: cars) {
            if(car.isTransmission(transmission)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param feature
     * Prints the inventory of cars by feature
     */
    public void printInventoryByFeature(CarFeatures feature) {
        for(Car car: cars) {
            if(car.hasFeature(feature)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param make
     * @param model
     * Prints the inventory of cars by make and model
     */
    public void printInventoryByMakeAndModel(CarMake make, CarModel model) {
        for(Car car: cars) {
            if(car.isMake(make) && car.isModel(model)) {
                System.out.println(car);
            }
        }
    }

    /**
     * @param make
     * @param model
     * @param bodyType
     * Prints the inventory of cars by make, model, and body type
     */
    public void printInventoryByMakeModelBodyType(CarMake make, CarModel model, BodyType bodyType) {
        for(Car car: cars) {
            if(car.isMake(make) && car.isModel(model) && car.isBodyType(bodyType)) {
                System.out.println(car);
            }
        }
    }
}