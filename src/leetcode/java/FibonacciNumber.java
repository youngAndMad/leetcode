package leetcode.java;

public class FibonacciNumber {
    public int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}
