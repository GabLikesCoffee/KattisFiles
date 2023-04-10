import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    Integer number = scnr.nextInt();
    int length;

    String strNumber = number.toString();

    length = strNumber.length();

    if (length < 3) {
      System.out.print("99");
      scnr.close();
      return;
    }

    String[] array = new String[length];

    for (int i = 0; i < length; i++) {
      array[i] = "" + strNumber.charAt(i);
    }

    String strLastTwoDigits = array[length - 2] + array[length - 1];

    int lastTwoDigits = Integer.parseInt(strLastTwoDigits);

    if (lastTwoDigits > 48) {
      array[length - 1] = "9";
      array[length - 2] = "9";
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
      }
    } else {
      array[length - 1] = "0";
      array[length - 2] = "0";

      String strNewNumber = "";

      for (int i = 0; i < array.length; i++) {
        strNewNumber += array[i];
      }
      int newNumber = Integer.parseInt(strNewNumber);
      System.out.print(newNumber - 1);

    }
    scnr.close();
  }
}