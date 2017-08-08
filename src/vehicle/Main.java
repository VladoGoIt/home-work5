package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class Main {
    public static void main (String[] args){
        CarWheel wheel1 = new CarWheel(0.8);

        wheel1.wheelStatusInfo();

        wheel1.wheelWearPercent(30);

        wheel1.wheelStatusInfo();

        wheel1.putNewWheel();

        wheel1.wheelStatusInfo();


    }
}
