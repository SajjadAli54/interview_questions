public class App {
    /**
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        CarInventoryList carInventoryList = new CarInventoryList();

        Car car1 = new Car(
            CarMake.AUDI, 
            CarModel.A4, 
            BodyType.SEDAN, 
            EngineType.V4, 
            EngineCC.CC_1000, 
            "RED", 
            Transmission.AUTO, 
            new CarFeatures[]{
                CarFeatures.ABS,
                CarFeatures.AIRBAGS,
                CarFeatures.AIR_CONDITIONING,
                CarFeatures.ALLOY_WHEELS,
                CarFeatures.CD_PLAYER,
                CarFeatures.ELECTRIC_WINDOWS,
                CarFeatures.POWER_STEERING,
                CarFeatures.SUNROOF
            }
        );

        carInventoryList.addCar(car1);
        
        Car car2 = new Car(
            CarMake.BMW, 
            CarModel.A6, 
            BodyType.SUV, 
            EngineType.V6, 
            EngineCC.CC_2000, 
            "BLACK", 
            Transmission.MANUAL, 
            new CarFeatures[]{
                CarFeatures.ABS,
                CarFeatures.AIRBAGS,
                CarFeatures.AIR_CONDITIONING,
                CarFeatures.ALLOY_WHEELS,
                CarFeatures.CD_PLAYER,
                CarFeatures.ELECTRIC_WINDOWS,
                CarFeatures.POWER_STEERING,
                CarFeatures.SUNROOF
            }
        );

        carInventoryList.addCar(car2);

        Car car3 = new Car(
            CarMake.BMW, 
            CarModel.A6, 
            BodyType.SUV, 
            EngineType.V6, 
            EngineCC.CC_2000, 
            "BLACK", 
            Transmission.MANUAL, 
            new CarFeatures[]{
                CarFeatures.ABS,
                CarFeatures.AIRBAGS,
                CarFeatures.AIR_CONDITIONING,
                CarFeatures.ALLOY_WHEELS,
                CarFeatures.CD_PLAYER,
                CarFeatures.ELECTRIC_WINDOWS,
                CarFeatures.POWER_STEERING,
                CarFeatures.SUNROOF,
                CarFeatures.NAVIGATION
            }
        );

        carInventoryList.addCar(car3);

        Car car4 = new Car(
            CarMake.BMW, 
            CarModel.A6, 
            BodyType.SUV, 
            EngineType.V6, 
            EngineCC.CC_2000, 
            "BLACK", 
            Transmission.MANUAL, 
            new CarFeatures[]{
                CarFeatures.ABS,
                CarFeatures.AIRBAGS,
                CarFeatures.AIR_CONDITIONING,
                CarFeatures.ALLOY_WHEELS,
                CarFeatures.CD_PLAYER,
                CarFeatures.ELECTRIC_WINDOWS,
                CarFeatures.POWER_STEERING,
                CarFeatures.SUNROOF,
                CarFeatures.NAVIGATION,
                CarFeatures.REAR_CAMERA
            }
        );

        carInventoryList.addCar(car4);

        Car car5 = new Car(
            CarMake.BMW, 
            CarModel.A6, 
            BodyType.SUV, 
            EngineType.V6, 
            EngineCC.CC_2000, 
            "BLACK", 
            Transmission.MANUAL, 
            new CarFeatures[]{
                CarFeatures.ABS,
                CarFeatures.AIRBAGS,
                CarFeatures.AIR_CONDITIONING,
                CarFeatures.ALLOY_WHEELS,
                CarFeatures.CD_PLAYER,
                CarFeatures.ELECTRIC_WINDOWS,
                CarFeatures.POWER_STEERING,
                CarFeatures.SUNROOF,
                CarFeatures.NAVIGATION,
                CarFeatures.REAR_CAMERA,
                CarFeatures.REAR_WIPER
            }
        );

        carInventoryList.addCar(car5);

        carInventoryList.printInventory();

        System.out.println();

        carInventoryList.printInventoryByFeature(CarFeatures.NAVIGATION);
    }
}
