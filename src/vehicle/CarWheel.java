package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class CarWheel {
    private double wheelStatus;
    private double max = 1;
    private double min = 0;
    private double wear;

    public CarWheel(){
        wheelStatus = max;
        wear = 0;

    }
    public CarWheel(double status){
        status = wheelStatus;
        if (status > max){
            wheelStatus = max;
        }else if (status < min){
            wheelStatus = min;
        }
    }

    public double wheelWear(double wear){
        wheelStatus = (wheelStatus * 100 - wear) / 100;
        if (wheelStatus < 0){
            wheelStatus = 0;
            return wheelStatus;
        }else {
            return wheelStatus;
        }
    }

    public double putNewWheel(){
        wheelStatus = 1;
        return wheelStatus;
    }

    public void wheelStatusInfo(){
        if (wheelStatus == 1){
            System.out.println("колесо нове");
        }else {
        System.out.println("Цілістність шини " + (wheelStatus * 100));
        }
    }
}
