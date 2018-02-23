package org.shalim.dojo.fizzbuzz;

public class FizzBuzz {

  public static String printNum(int i) {
    String solution = "";
    if (i % 3 == 0) {
      solution += "Fizz";
    }
    if (i % 5 == 0) {
      solution += "Buzz";
    }
    if (solution.isEmpty()) {
      solution = String.valueOf(i);
    }
    return solution;
  }

  public static void main(String[] args) {
    final String[] tests = {"1:1", "21:Fizz", "15:FizzBuzz", "25:Buzz"};
    for (String test : tests) {
      final String[] testCase = test.split(":");
      final String sol = printNum(Integer.parseInt(testCase[0]));
      if (!testCase[1].equals(sol)) {
        final String errorMsg = String.format(
            "For input %s, expected solution is: %s but found: %s", testCase[0], testCase[1], sol);
        System.out.println(errorMsg);
        return;
      }
    }
    System.out.println("Success");
  }
}
