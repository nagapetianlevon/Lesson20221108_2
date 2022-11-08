import itschool.Point;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

import static itschool.Point.count;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PrintStream out = new PrintStream(System.out);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 9);
        System.out.println(new Point(55,55).distance(p2));
        System.out.println(count);

        System.out.println(p1.distance(5, 6));
        System.out.println(String.format(Locale.US,"%.4f", p1.distance(p2)));
        itschool2.dao.Point user = new itschool2.dao.Point("User2", 25);

        System.out.println(user);
     }
}

