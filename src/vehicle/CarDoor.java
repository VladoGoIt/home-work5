package vehicle;

/**
 * Created by Volodymyr Dzhuhalyk on 01.08.2017.
 */
public class CarDoor {

    private boolean doorStatusClose;
    private boolean windowStatusClose;

    public CarDoor(){
        doorStatusClose = true;
        windowStatusClose = true;
    };

    public CarDoor(boolean doorStatusClose, boolean windowStatusClose){
        this.doorStatusClose = doorStatusClose;
        this.windowStatusClose = windowStatusClose;
    }

    public boolean openDoor(){
        doorStatusClose = false;
        return doorStatusClose;
    }

    public boolean closeDoor(){
        doorStatusClose = true;
        return doorStatusClose;
    }
    public boolean openCloseDoor(){
        doorStatusClose = !doorStatusClose;
        return doorStatusClose;
    }
    public boolean openWindow(){
        windowStatusClose = false;
        return windowStatusClose;
    }

    public boolean closeWindow(){
        windowStatusClose = true;
        return windowStatusClose;
    }
    public boolean openCloseWindow(){
        windowStatusClose = !windowStatusClose;
        return windowStatusClose;
    }

    public static void doorWindowStatusInfo(){
        System.out.println("Door is close" + doorStatusClose);
        System.out.println("Window is close" + windowStatusClose);
    }

}
