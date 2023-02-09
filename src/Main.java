public class Main {
    public static void main(String[] args) {

        //1 ввод начальных условий
        int balans = 100;
        int topUpYourAccount = 1100;

        // 2 считает баланс + пополнение
        balans = balans + topUpYourAccount;

        //3 расчет бонуса (условие расчета бонуса)
        int bonus = 0;
        int ifSumBonus = 1000;
        if (balans > ifSumBonus) {
            bonus = balans / 100 * 1;
        }

        //4 считает и выводит итоговый счет и бонуса
        int finalSum = balans + bonus;
        System.out.println("Итоговый счёт:" + finalSum);
        System.out.println("Итоговый бонус:" + bonus);
    }
}