package hw1;

public class BinaryAndLinearSearch {
    public static void main(String[] args) {

    }

    class LinearSearch {
        public int linearSearch(int[] inputArray, int searchTarget) {
            // Fill in the code here to complete a linear search
            // Hint: loop through array, check if each element is searchTarget
            // If it is, return the *index*
            // If you don't find it, return -1
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] == searchTarget) {
                    return i;
                }
            }
            return -1;
        }
    }

    class BinarySearch {
        public int binarySearch(int[] sortedArray, int searchTarget) {
            // Fill in the code here to complete a binary search
            // Hint: Divide and conquer! How did we play the guess my number game?
            // If it is, return the *index*
            // If you don't find it, return -1
            int min = 0;
            int max = sortedArray.length - 1;

            while (min <= max) {
                int mid = (max + min) / 2;

                if (searchTarget < sortedArray[mid]) {
                    max = mid - 1;
                } else if (searchTarget > sortedArray[mid]) {
                    min = mid + 1;
                } else if (searchTarget == sortedArray[mid]) {
                    return mid;
                }
            }
            return -1;
        }
    }
}
