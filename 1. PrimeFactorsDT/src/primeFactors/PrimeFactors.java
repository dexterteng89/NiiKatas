package primeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<Integer>();

        for (int target = 2 ; n > 1 ; target++) {
            for ( ; n%target == 0 ; n /= target) {
                list.add(target);
            }
        }

        return list;
    }
}
