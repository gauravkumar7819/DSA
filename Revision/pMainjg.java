package Revision;

public class pMainjg {
    public static void main(String[] args) {
        // Example array of integers
        int[] integerArray = {1, 2, 3, 4, 5};

        // Index where you want to insert the underscore
        int indexToInsertUnderscore = 2;

        // Create a new array to hold the modified elements
        int[] newArray = new int[integerArray.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < integerArray.length; i++) {
            // If the current index is where we want to insert the underscore, insert it
            if (i == indexToInsertUnderscore) {
                newArray[i] = -1; // Inserting underscore, you can use any other value as well
            } else {
                newArray[i] = integerArray[i];
            }
        }

        // Convert the new array to a string and print it
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < newArray.length; i++) {
            if (i > 0) {
                result.append("_"); // Add underscore between elements
            }
            if (newArray[i] != -1) {
                result.append(newArray[i]);
            }
        }

        System.out.println(result.toString());
    }
}
