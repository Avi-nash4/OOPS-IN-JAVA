import java.awt.desktop.SystemSleepEvent;

class Animals{
    void dogs(){
        System.out.println("dogs are brawking");
    }
}
class CAT extends Animals{

}



public class singleInheitance {
    public static void main(String[] args) {
         CAT obj1 =new CAT();
         obj1.dogs();
    }
}
