//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double result = calculateFutureValue(1000, 0.05, 5); // 5% growth for 5 years
        System.out.println("Future value: " + result);
    }
    public static double calculateFutureValue(double value, double growthRate, int years) {
        if (years == 0) return value;
        return calculateFutureValue(value * (1 + growthRate), growthRate, years - 1);
    }
}

/*
    1. Explain the concept of recursion and how it can simplify certain problems:
    => Recursion is when a method calls itself to solve smaller parts of a problem. It simplifies complex problems by breaking them down into similar subproblems. Examples include factorials, Fibonacci numbers, and solving tree-based problems or repeated growth calculations.

    2. Discuss the time complexity of your recursive algorithm:
    => The time complexity of this recursive future value function is O(n), where n is the number of years. This is because the function calls itself once for each year, doing a constant-time operation at each step.

    3. Explain how to optimize the recursive solution to avoid excessive computation:
    => Although this recursion is already linear, it can still be optimized by converting it into an iterative loop, which avoids the overhead of recursive function calls and stack usage. Tail recursion or memoization can also help in other recursive problems.
 */

/*
    OUTPUT
    Future value: 1276.2815625000003
 */