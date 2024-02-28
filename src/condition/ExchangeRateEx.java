package condition;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 20;
        int exchangeRate = 1300;
        String result;
        if (dollar < 0) {
            result = "잘못된 금액입니다.";
        } else if (dollar == 0) {
            result = "환전할 금액이 없습니다.";
        } else {
            int won = exchangeRate * dollar;
            result = "환전금액은 " + won + "원입니다.";
        }
        System.out.println(result);
    }
}
