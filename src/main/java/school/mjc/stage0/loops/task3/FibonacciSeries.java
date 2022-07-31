package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 1;
        System.out.println(0);
        System.out.println(1);
        for (int i = 3; i <= lastFibonacci; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
