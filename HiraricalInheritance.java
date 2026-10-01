import java.awt.desktop.SystemSleepEvent;

class Parents{
    void rupesh(){
        System.out.println("Rupesh is a good boy");
    }
}
class child extends Parents{
    void ramesh(){
        System.out.println("Ramesh is a rider");
    }

}
class baby extends Parents{
    void ram(){
        System.out.println("Baby buy a toy");
    }
}
public class HiraricalInheritance {


    public static void main(String[] args) {
        Parents a = new Parents();
        a.rupesh();
        child b= new child();
        b.rupesh();
        b.ramesh();

        baby c = new baby();
        c.ram();
        c.rupesh();

    }
}


