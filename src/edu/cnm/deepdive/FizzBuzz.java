package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int counter = 0; counter <= 100; counter++) {
      String status = "";
      boolean counterIsFizz= (counter % 3 == 0);
      boolean counterIsBuzz= (counter % 5 == 0);
       if (counterIsFizz) {
         status += "fizz";
       }
       if (counterIsBuzz) {
         status += "buzz";
       }
       if (status.isEmpty()) {
        status += counter;
       }
    System.out.println(status);
    }


    }

  }


