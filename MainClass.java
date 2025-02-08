class animal{
    String name;
    int age;
    void makesound(){
        System.out.println("animal makes sound");

    }
}

public class MainClass {
    public static void main(String[] args) {
        animal obj1=new animal();
        obj1.name="hello";
        obj1.age=10;
        obj1.makesound();
    }
}
