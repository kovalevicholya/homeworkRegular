package regularExpressions;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularVMain {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        fr = new FileReader("War.txt");
        Scanner scan = new Scanner(fr);
        //String num=scan.nextLine();
        int i=1;
        //Pattern pt = Pattern.compile("Война и мир");
        //Matcher matcher = pt.matcher(scan);
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();

        //while (matcher.find()){
        //    System.out.println("Строка h*" + matcher.start());
        //}
    }
}
