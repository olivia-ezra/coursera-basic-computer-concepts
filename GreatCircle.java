/* *****************************************************************************
 *  Name:              Olivia Ezra
 *  Coursera User ID:  f34dec8aae655957f9556c8434d09a45
 *  Last modified:     May 1, 2021
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double EARTH_RADIUS = 6371.0;

        double xDistanceInRadians = Math.toRadians(x2 - x1);
        double yDistanceInRadians = Math.toRadians(y2 - y1);

        double a = Math.pow(Math.sin(xDistanceInRadians / 2), 2) +
                Math.pow(Math.sin(yDistanceInRadians / 2), 2) *
                        Math.cos(Math.toRadians(x1)) *
                        Math.cos(Math.toRadians(x2));


        System.out.println(2 * EARTH_RADIUS * Math.asin(Math.sqrt(a)));
    }
}



