class Address{
    String city;
    String state;
    void diplayAddress(){
        System.out.println("Address :"+state+" "+city);
    }
}
class student
{
String name;
int value;
Address add =new Address();
student(String n , int v)
{
    name=n;
    value = v;
}
void  printstdDetailas()
{
    System.out.println("Name :" +name);
    System.out.println("value :"+value);
    add.diplayAddress();

}
}
public class hasA {
    public static void main(String[] args) {
student std1 = new student("Deepak",101);
std1.printstdDetailas();
    }
}
