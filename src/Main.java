import java.util.Scanner;

/**
 * @author El Baron 15.02.2023
 */
public class Main {
    public static void main(String[] args) {
        //Конвертер валют из Российского рубля в
        //доллар США и Евро по курсу РБК на 15 февраля 2023 года
        /*System.out.println(1000 + " российских рублей можно обменять" +
                " на\n" + 1000/73.86 + " американских долларов,");
        System.out.println("либо же " + 1000/79.33 + " евро");*/

        System.out.println("Введите сумму в рублях");
        double rubl = new Scanner(System.in).nextDouble();
        System.out.println("Введите актуальный курс доллара к рублю (" +
                "стоимость одного доллара в рублях)");
        double usd = new Scanner(System.in).nextDouble();
        System.out.println("Введите актуальный курс евро (стоимость одного евро " +
                "в рублях)");
        double eur = new Scanner(System.in).nextDouble();
        double result1 = rubl / eur;
        double result2 = rubl / usd;
        System.out.println(rubl + " рублей равны " + result1 + " евро "
        + "или " + result2 + " долларов");



    }
}
