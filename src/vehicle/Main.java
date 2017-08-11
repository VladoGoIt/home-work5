package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class Main {
    public static void main (String[] args){
        Car audi = new Car(2017, 3.5, 200, 10, 4, 1, 20);

        CarWheel wheel1 = new CarWheel(0.4);
        CarWheel wheel2 = new CarWheel(0.5);
        CarWheel wheel3 = new CarWheel(0.6);
        CarWheel wheel4 = new CarWheel(0.7);

        CarDoor door1 = new CarDoor();
        CarDoor door2 = new CarDoor();
        CarDoor door3 = new CarDoor();
        CarDoor door4 = new CarDoor();



        for(CarWheel wheel: wheelsArr) {
            wheel.wheelStatusInfo();
        }
         audi.carInfo();
        audi.doorArrInfo();











    }
}
