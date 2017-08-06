package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class Main {
    public static void main (String[] args){
       CarWheel wheel = new CarWheel();
       wheel.wheelStatusInfo();
       wheel.wheelWear(20);
       wheel.wheelStatusInfo();
       wheel.putNewWheel();
        wheel.wheelStatusInfo();

    }
}
