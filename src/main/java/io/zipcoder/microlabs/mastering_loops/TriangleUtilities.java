package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i <= numberOfRows ; i++) {
            result += TriangleUtilities.getRow(i) + "\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";

        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars ;
    }

    public static String getSmallTriangle() {
    return TriangleUtilities.getTriangle(4);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
