package langPackage;
class Person {
    int id;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }
    Person(int id){
        this.id = id;
    }
}
public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(30303);
        Person p2 = new Person(30303);
        System.out.println(p1.equals(p2));

    }
}
