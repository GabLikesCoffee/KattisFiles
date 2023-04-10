import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = scnr.nextLine();
        String target = scnr.nextLine();

        char inputLast = input.charAt(input.length() - 1);
        char targetLast = target.charAt(target.length() - 1);

        // input is longer than target
        if (input.length() >= target.length()) {
            // both inputs end in h
            if (inputLast == 'h' && targetLast == 'h') {
                // checks that there are only a's in input
                if (input.length() > 1) {
                    for (int i = 0; i < input.length() - 2; i++) {
                        if (input.charAt(i) != 'a') {
                            System.out.print("no");
                            scnr.close();
                            return;
                        }
                    }
                }
                if (target.length() > 1) {
                    for (int i = 0; i < target.length() - 2; i++) {
                        if (target.charAt(i) != 'a') {
                            System.out.print("no");
                            scnr.close();
                            return;
                        }
                    }
                }
                System.out.print("go");
                scnr.close();
                return;
            }
        }
        System.out.print("no");
        scnr.close();
        return;
    }
}
