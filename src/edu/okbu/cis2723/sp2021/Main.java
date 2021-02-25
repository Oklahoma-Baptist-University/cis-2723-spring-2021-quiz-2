package edu.okbu.cis2723.sp2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("q2.txt");
        Scanner fileScan = new Scanner(inFile);

        int numCom = 0;
        int numEdu = 0;
        int numGov = 0;
        int numUnknown = 0;
        int total = 0;
        int invalidUserIDs = 0;

        DecimalFormat pctFormat = new DecimalFormat("0.00%");

        // Read the website
        while (fileScan.hasNext()) {
            String website = fileScan.next();

            String userID = website.substring(0, website.indexOf('@'));
            if (userID.startsWith(".")) {
                invalidUserIDs++;
            }
            String domain = website.substring(website.indexOf('@') + 1);

            String extension = website.substring(website.lastIndexOf(".") + 1);
            if (extension.equals("com")) {
                numCom++;
            } else if (extension.equals("gov")) {
                numGov++;
            } else if (extension.equals("edu")) {
                numEdu++;
            } else {
                numUnknown++;
            }
            total++;
        }

        System.out.println("Statistics:");
        System.out.println("\tNumber of invalid user IDs " + pctFormat.format((double) invalidUserIDs / total));
        System.out.println("\tNumber of .com sites " + pctFormat.format((double) numCom / total));
        System.out.println("\tNumber of .edu sites " + pctFormat.format((double) numEdu / total));
        System.out.println("\tNumber of .gov sites " + pctFormat.format((double) numGov / total));
        System.out.println("\tNumber of unknown sites " + pctFormat.format((double) numUnknown / total));
    }
}
