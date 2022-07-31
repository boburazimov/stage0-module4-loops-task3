package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = t < 0 ? t * -1 : t;
        for (int i = 0; t != 0; i++){
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
