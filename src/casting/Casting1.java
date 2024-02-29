package casting;

public class Casting1 {
    public static void main(String[] args) {
        byte byteVar = 1;
        short shortVar;
        int intVar;
        long longVar;
        double doubleVar;

        shortVar = byteVar;
        System.out.println("shortVar = " + shortVar);

        intVar = shortVar;
        System.out.println("intVar = " + intVar);

        longVar = intVar;
        System.out.println("longVar = " + longVar);

        doubleVar = longVar;
        System.out.println("doubleVar = " + doubleVar);
    }
}
