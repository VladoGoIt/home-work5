package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class Car {
    private int madeData;
    private double engineType;
    private int maxSpeed;
    private double acceleration;
    private int maxPassengers;
    private int passengersInside;
    private int currentSpeed;
    private int[] wheels;
    private int[] doors;

    public Car(int year){
        madeData = year;
    }

    public Car(
            int year,
            double engineType,
            int maxSpeed,
            double acceleration,
            int maxPassengers,
            int passengersInside,
            int currentSpeed
            )
    {
        madeData = year;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.maxPassengers = maxPassengers;
        this.passengersInside = passengersInside;
        this.currentSpeed = currentSpeed;
    }

    public int changeCurrentSpeed (int newSpeed){
        currentSpeed = newSpeed;
        return currentSpeed;
    }

    public int addPassenger (){
        ++passengersInside;
        return passengersInside;
    }

    public int extractPassenger (){
        --passengersInside;
        return passengersInside;
    }

    public int extractAllPassenger (){
        passengersInside = 0;
        return passengersInside;
    }

    //public int[] extractAllWheels(){
     //   wheels [i] = wheels [0];
     //   return wheels;
    //}

    public void carInfo(){
        System.out.println(madeData);
        System.out.println(engineType);
        System.out.println(maxSpeed);
        System.out.println(acceleration);
        System.out.println(maxPassengers);
        System.out.println(passengersInside);
        System.out.println(currentSpeed);
        System.out.println(wheels);
        System.out.println(doors);
    }
}
