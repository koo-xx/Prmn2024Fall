package lecture02;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {

        String number = "B2231230";

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。：");
        String gakuseki = scan.nextLine();

        Gakuseki g = new Gakuseki();
        g.hanbetu(number, gakuseki);
    }
}
