public class usingConstructor {
    String name;
    int rollno;
    int marks;
    public usingConstructor(String n, int  rn ,int m){
        name=n;
        rollno=rn;
        marks=m;


    }

    public static void main(String[] args) {
        usingConstructor std1=new usingConstructor("AVINASH",1,90);
        usingConstructor std2 = new usingConstructor("AMIT",2,80);
        System.out.println("Name :"+std1.name+" "+"Roll no:"+std1.rollno +" "+ "Marks:"+std1.marks);
        System.out.println(std2.name+" "+std2.rollno+" "+std2.marks);
    }
}
