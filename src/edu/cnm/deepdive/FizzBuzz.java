package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int counter = 0; counter <= 100; counter++) {
      String status = getStatus(counter);
      System.out.println(status);
     }
  }

  static String getStatus(int value) {
    String status = "";
    boolean counterIsFizz= (value % 3 == 0);
    boolean counterIsBuzz= (value % 5 == 0);
    if (counterIsFizz) {
      status += "fizz";
    }
     if (counterIsBuzz) {
      status += "buzz";
    }
    if (status.isEmpty()) {
     status += value;
    }
    return status;
  }

}


