package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class Car {
    private int madeData;
    private double engineType;
    private int maxSpeed;
    private int acceleration;
    private int maxPassengers;
    private int passengersInside;
    private int currentSpeed;
    private CarWheel[] wheelsArr;
    private CarDoor[] doorsArr;

    public Car(int year) {
        madeData = year;
    }

    public Car(
            int year,
            double engineType,
            int maxSpeed,
            int acceleration,
            int maxPassengers,
            int passengersInside,
            int currentSpeed
    ) {
        madeData = year;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.maxPassengers = maxPassengers;
        this.passengersInside = passengersInside;
        this.currentSpeed = currentSpeed;
    }

    public int changeCurrentSpeed(int newSpeed) {
        currentSpeed = newSpeed;
        return currentSpeed;
    }

    public int maxCurentSpeed(maxSpeed){

    }

    public int addPassenger() {
        if (passengersInside < maxPassengers) {
            ++passengersInside;
        } else {
            System.out.println("нема місця");
        }
        return passengersInside;
    }

    public int extractPassenger() {
        --passengersInside;
        return passengersInside;
    }

    public int extractAllPassenger() {
        passengersInside = 0;
        return passengersInside;
    }

    public CarWheel[] createWheelArr(CarWheel wheel1, CarWheel wheel2, CarWheel wheel3, CarWheel wheel4) {
        wheelsArr = new CarWheel[]{wheel1, wheel2, wheel3, wheel4};
        return wheelsArr;
    }


    public CarDoor[] createDoorArr(CarDoor door1, CarDoor door2, CarDoor door3, CarDoor door4) {
        int num = 4;
        CarDoor[] doorsArr = new CarDoor []{door1, door2, door3, door4};
        return doorsArr;

    }

    public void doorArrInfo(int x) {

        }


    public void carInfo() {
        System.out.println("Year made " + madeData);
        System.out.println("Engine type " + engineType + " L");
        System.out.println("MaxSpeed " + maxSpeed + " km/h");
        System.out.println("acceleration " + acceleration + " sec");
        System.out.println("Max passengers " + maxPassengers);
        System.out.println("Passengers inside " + passengersInside);
        System.out.println("Current speed " + currentSpeed  + " km/h");

    }

    private void wheelArrInfo() {
        for (int i = 0; i < wheelsArr.length; i++) {
            System.out.println("wheel" + (i + 1) + wheelsArr[i] + ", ");
        }
    }

}

