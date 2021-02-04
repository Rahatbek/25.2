package kg.megacom;

import static java.lang.Math.pow;
import static java.lang.Math.subtractExact;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Pow");
        double pow = pow(8,4);// 8 * 8 = 64 * 8 = 512 * 8 = 4096
        System.out.println(pow);

        System.out.println("SubstractExact");
        int substractExact = subtractExact(6, 8);// 6 - 8 = -2
        System.out.println(substractExact);

        System.out.println("toDegrees");
        double toDegrees = Math.toDegrees(15.5);// не понял формулы, (логики) преобразует радианы в градусы
        System.out.println(toDegrees);

        System.out.println("Signum");
        double signum = Math.signum(25);
        System.out.println(signum);// if(d > 0){return 1;} else if(d < 0) {return -1} else return 0;

        System.out.println("Hypot");
        double hypot = Math.hypot(3,4);
        System.out.println(hypot);// (3*3) + (4*4) = (25/5) хорошо для нахождения длины гипотенузы
    }
}
