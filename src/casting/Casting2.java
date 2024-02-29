package casting;

public class Casting2 {
    public static void main(String[] args) {
        long longVar = 10000000000L;
        int intVar = 10;
        short shortVar;
        byte byteVar;

        // 명시적 형 변환
        shortVar = (short) intVar;
        System.out.println("shortVar = " + shortVar);
        byteVar = (byte) shortVar;
        System.out.println("byteVar = " + byteVar);

        // 명시적 형 변환에 따른 오버플로우
        intVar = (int) longVar;
        System.out.println("intVar = " + intVar);


    }
}
