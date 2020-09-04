package hw1;
import java.util.*;

public class WordAnalysis {
    // Constants for function names in input
    public static final String MIN_METHOD_NAME = "MIN";
    public static final String MAX_METHOD_NAME = "MAX";
    public static final String RANGE_METHOD_NAME = "RANGE";
    public static final String AVERAGE_METHOD_NAME = "AVERAGE";
    public static final String MODE_METHOD_NAME = "MODE";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read in the method name that we want to call
        String methodName = sc.nextLine();

        // Read in number of words
        int numWords = Integer.parseInt(sc.nextLine());

        // Read in list of words
        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            System.out.println();
            words[i] = sc.nextLine();
        }


        // Run the specified method
        switch (methodName) {
            case MIN_METHOD_NAME:
                System.out.println(minWordLength(words));
                break;
            case MAX_METHOD_NAME:
                System.out.println(maxWordLength(words));
                break;
            case RANGE_METHOD_NAME:
                System.out.println(wordLengthRange(words));
                break;
            case AVERAGE_METHOD_NAME:
                System.out.println(averageWordLength(words));
                break;
            case MODE_METHOD_NAME:
                System.out.println(mostCommonWordLength(words));
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static int minWordLength(String[] words) {
        // TODO implement this function
        int min = words[0].length();

        for (int i = 0; i < words.length; i++) {

            if (min > words[i].length()) {
                min = words[i].length();
            }
        }
        return min;

        // throw new UnsupportedOperationException();
    }

    private static int maxWordLength(String[] words) {
        // TODO implement this function
        //throw new UnsupportedOperationException();

        int max = words[0].length();

        for (int i = 0; i < words.length; i++) {

            if (max < words[i].length()) {
                max = words[i].length();
            }
        }

        return max;


    }

    private static int wordLengthRange(String[] words) {
        // TODO implement this function
        int max = words[0].length();
        int min = words[0].length();

        for (int i = 0; i < words.length; i++) {

            if (max < words[i].length()) { // if the current max is less than the length of the ith word fulfill code inside
                max = words[i].length(); // assigns the length of the ith word to be the max
            }

            if (min > words[i].length()) { // if the current min is greater than the length of the ith word fulfill code inside
                min = words[i].length(); // assigns the length of the ith word to be the min
            }

        }
        return max - min;

        // throw new UnsupportedOperationException();
    }

    private static String averageWordLength(String[] words) {
        // TODO implement this function
        double sum = 0;

        for (int i = 0; i < words.length; i++) {
            sum += words[i].length(); // after each iteration we are change the sum = the current sum plus the length of the ith word

        }
        double avg = sum / words.length;

        return String.format("%.2f", avg);

        // throw new UnsupportedOperationException();
    }

    private static int mostCommonWordLength(String[] words) {
        // TODO implement this function
        int mode = 0; // this denotes the most common word length
        int numMostCommonLength = 0; // this variable will act as something to compare to ex. if the mode changes from 3 to 5 it is because we will compare the current numMostCommonLength which is the number of words of length 3 to the numSameLength of words that have length of 5

        for (int i = 1; i < 100; i++) {
            int numSameLength = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == i) {
                    numSameLength++;
                }
            }
            if (numSameLength > numMostCommonLength) {
                numMostCommonLength = numSameLength;
                mode = i;
            } else if (numMostCommonLength == numSameLength) {
                mode = -1;
            }
        }

        return mode;


        // throw new UnsupportedOperationException();
    }
}
