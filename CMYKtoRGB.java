/* *****************************************************************************
 *  Name:              Olivia Ezra
 *  Coursera User ID:  f34dec8aae655957f9556c8434d09a45
 *  Last modified:     May 2, 2021
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        long W = Math.round(1 - K);
        long R = Math.round(255 * W * (1 - C));
        long G = Math.round(255 * W * (1 - M));
        long B = Math.round(255 * W * (1 - Y));

        System.out.println("red = " + R);
        System.out.println("green = " + G);
        System.out.println("blue = " + B);
    }
}
