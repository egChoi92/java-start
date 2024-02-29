package loop;

public class ForEx2 {
    public static void main(String[] args) {
        int endNum = 10;

        int num = 2;
        for (int count = 1; count <= endNum; count++) {
            System.out.println("num = " + num);
            num += 2;
        }

        for (int num2 = 2, count = 1; count <= endNum; num2 += 2, count++) {
            System.out.println("num2 = " + num2);
        }

    }
}
