package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class CarWheel {
    private double wheelStatus;
    private double wheelMax = 1;
    private double wheelMin = 0;
    private double wear;

    public CarWheel(){
        wheelStatus = wheelMax;
        wear = 0;

    }
    public CarWheel(double status){
        wheelStatus = status;
        if (wheelStatus > wheelMax){
            wheelStatus = wheelMax;
        }else if (wheelStatus < wheelMin){
            wheelStatus = wheelMin;
        }
    }

    public double wheelWearPercent(double wearPercent){
        wear = wearPercent;
        wheelStatus = (wheelStatus * 100 - wear) / 100;
        if (wheelStatus < wheelMin){
            wheelStatus = wheelMin;
            return wheelStatus;
        }else {
            return wheelStatus;
        }
    }

    public double putNewWheel(){
        wheelStatus = wheelMax;
        return wheelStatus;
    }

    public void wheelStatusInfo(){
        if (wheelStatus == wheelMax){
            System.out.println("Колесо нове");
        }else {
        System.out.println("Цілістність шини " + (wheelStatus * 100) + "%");
        }
    }
}
