package loop;

public class NestedForEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.println(i + "단");
                }
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
