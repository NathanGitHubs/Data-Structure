package hw2;
import java.text.DecimalFormat;

public class RootFinder {
    public static void main(String[] args) {
    /* when submitting, please don't leave anything in the main method.
        for testing, you can uncomment the lines below and fill in
        the variables with the variables you want to test: */
         String result1 = squareRootFinder(41, 100);
         System.out.println(result1);
         String result2 = nthRootFinder(60, 100, 3);
         System.out.println(result2);
    }

    public static String squareRootFinder(int number, int iterations){
        // TODO: implement the squareRootFinder here
        DecimalFormat decimalFormat = new DecimalFormat (".00000");

        double low = (double) 0;
        double high = (double) number;
        double root = (double) high / 2;

        for(int i = 1; i < iterations; i++) {
            if(Math.pow(root,2) < number) {
                low = (double) root;
                root = (double) (high + low) / 2;
            }else if(Math.pow(root,2) > number) {
                high = (double) root;
                root = (double) (high + low) / 2;
            }
        }

        String answer = decimalFormat.format(root);
        return answer;

    }

    public static String nthRootFinder(int number, int iterations, int n){
        // TODO: implement the nthRoofFinder here
        DecimalFormat decimalFormat = new DecimalFormat (".00000");

        double low = (double) 0;
        double high = (double) number;
        double root = (double) high / 2;

        for(int i = 1; i < iterations; i++) {
            if(Math.pow(root,n) < number) {
                low = (double) root;
                root = (double) (high + low) / 2;
            }else if(Math.pow(root,n) > number) {
                high = (double) root;
                root = (double) (high + low) / 2;
            }
        }

        String answer = decimalFormat.format(root);
        return answer;
    }
}
