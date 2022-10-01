public class m {
    public static void main(String[] args) {
        int initialAmount = 100;
        int addAmount = 1100;

        int bonus;
        if (addAmount > 1000) {
            bonus = addAmount / 100;
        } else {
            bonus = 0;
        }
        int finalAmount = initialAmount + addAmount + bonus;
        System.out.println("Бонусов" + bonus);
        System.out.println("Итоговый счет" + finalAmount);
    }
}

