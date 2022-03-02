package io.zipcoder.microlabs.mastering_loops;

//import jdk.javadoc.internal.doclets.formats.html.Table;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(4);
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(9);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        StringBuilder gmt = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
           // System.out.println(i * tableSize);
            for (int j = 1; j <= tableSize; j++) {
                //System.out.print(i*j * tableSize);
                gmt.append(String.format("%3d |", i*j));

            }
            gmt.append("\n");
        }
        result = gmt.toString();

        return result;

    }
}


