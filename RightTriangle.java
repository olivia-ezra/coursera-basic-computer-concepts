/* *****************************************************************************
 *  Name:              Olivia Ezra
 *  Coursera User ID:  f34dec8aae655957f9556c8434d09a45
 *  Last modified:     May 1,2021
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        boolean isRightTriangle = false;
        if (a > 0 && b > 0 && c > 0) {
            int leftSideOfEquation = (a * a) + (b * b);
            int cSquared = c * c;
            isRightTriangle = leftSideOfEquation == cSquared;
        }

        System.out.println(isRightTriangle);
    }
}
