import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int statues = scnr.nextInt();

        double initialDays = statues;
        double days = initialDays;
        int extraDays = 1;
        int printers = 1;

        while ((int) days > (int) ((initialDays / (2 * printers)) + extraDays)) {

            days = (initialDays / (2 * printers)) + extraDays;
            printers = 2 * printers;
            extraDays++;
            // System.out.println("days " + days);
            // System.out.println("printers " + printers);
        }

        System.out.print((int) Math.ceil(days));
        scnr.close();
    }
}
