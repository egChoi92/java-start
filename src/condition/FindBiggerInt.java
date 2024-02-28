package condition;

public class FindBiggerInt {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int biggerInt = (a > b) ? a : b;
        String result = "더 큰 숫자는 " + biggerInt + "입니다.";
        System.out.println(result);
    }
}
