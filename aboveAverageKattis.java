import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int testCases = scnr.nextInt();
        while (testCases > 0) {

            int numStudents = scnr.nextInt();
            int[] studentScores = new int[numStudents];
            double average;
            int sum = 0;
            int aboveAverage = 0;
            double aboveAveragePercent;

            for (int i = 0; i < numStudents; i++) {
                studentScores[i] = scnr.nextInt();
                sum += studentScores[i];
            }

            average = sum / numStudents;

            for (int i = 0; i < numStudents; i++) {
                if (studentScores[i] > average)
                    aboveAverage++;
            }

            aboveAveragePercent = (((double) aboveAverage / numStudents) * 100);
            System.out.println(String.format("%.3f", aboveAveragePercent) + "%");

            testCases--;
        }

        scnr.close();
        return;
    }
}
