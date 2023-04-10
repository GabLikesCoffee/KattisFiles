import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        int a;
        int b;
        int c;
        char currentLetter;

        scnr.nextLine();
        String target = scnr.nextLine();

        if (num1 < num2 && num1 < num3) {
            a = num1;
            if (num2 < num3) {
                b = num2;
                c = num3;
            } else {
                b = num3;
                c = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            a = num2;
            if (num1 < num3) {
                b = num1;
                c = num3;
            } else {
                b = num3;
                c = num1;
            }
        } else {
            a = num3;
            if (num1 < num2) {
                b = num1;
                c = num2;
            } else {
                b = num2;
                c = num1;
            }
        }

        currentLetter = target.charAt(0);
        if (currentLetter == 'A') {
            System.out.print(a + " ");
            currentLetter = target.charAt(1);
            if (currentLetter == 'B') {
                System.out.print(b + " " + c);
            } else {
                System.out.print(c + " " + b);
            }
        } else if (currentLetter == 'B') {
            System.out.print(b + " ");
            currentLetter = target.charAt(1);
            if (currentLetter == 'A') {
                System.out.print(a + " " + c);
            } else {
                System.out.print(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            currentLetter = target.charAt(1);
            if (currentLetter == 'B') {
                System.out.print(b + " " + a);
            } else {
                System.out.print(a + " " + b);
            }
        }
        scnr.close();
        return;
    }
}
