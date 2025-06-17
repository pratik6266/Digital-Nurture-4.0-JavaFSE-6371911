//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Hashcode of first object: " + obj1.hashCode());
        System.out.println("Hashcode of second object: " + obj2.hashCode());

        // as hashcode is equal it is proof that only one object of that class is begin made.
    }
}

/*
OUTPUT:
Hashcode of first object: 149928006
Hashcode of second object: 149928006
 */