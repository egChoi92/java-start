package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        int endNum = 10;
        while (count <= endNum) {
            System.out.println("num = " + num);
            num += 2;
            count++;
        }
    }
}
