package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMain {
    public static void main(String[] args) {
       String message = "Я люблю JAVA";
        Pattern pt1 = Pattern.compile("h*");
        Matcher matcher1 = pt1.matcher(message);
        while (matcher1.find()){
            System.out.println("Строка h*" + matcher1.start()); //выводит 12 раз т.к. * означает любое количество раз(значит может и отсутствовать)
        }
        System.out.println();
        Pattern pt2 = Pattern.compile("h+");
        Matcher matcher2 = pt2.matcher(message);
        while (matcher2.find()){
            System.out.println("Строка h+" + matcher2.start()); // не выводит вообще т.к. + подразумевает хотябы одно совпадение, а его здесь нет
        }
        System.out.println();
        Pattern pt3 = Pattern.compile("h?");
        Matcher matcher3 = pt3.matcher(message);
        while (matcher3.find()){
            System.out.println("Строка h?" + matcher3.start()); //выводит 12 раз т.к. ? означает ниодного или один раз совпадение
        }
        System.out.println();
        String[] mails = new String[]{
                "Я люблю JAVA"
        };

        for (String mail : mails) {
            System.out.println("Строка h* " + mail + ". Результат проверки "+ mail.matches("h*"));
        }
        for (String mail : mails) {
            System.out.println("Строка h+ " + mail + ". Результат проверки "+ mail.matches("A+"));
        }
        for (String mail : mails) {
            System.out.println("Строка h? " + mail + ". Результат проверки "+ mail.matches("h?"));
        }

    }
}
