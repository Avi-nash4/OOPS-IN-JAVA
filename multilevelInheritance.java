class A{
    void boys(){
        System.out.println("boys are riding bikes");
    }
}
class B extends A{
    void girls(){
        System.out.println("girls are playing card");

    }
}
class C extends B{
    void mans(){
        System.out.println("Mans are walking");
    }

}
public class multilevelInheritance {
    public static void main(String[] args) {
        A aa = new A();
        aa.boys();


        B b =new B();
        b.girls();
        b.boys();


        C c =new C();
        c.mans();
        c.boys();
        c.girls();
    }
}
