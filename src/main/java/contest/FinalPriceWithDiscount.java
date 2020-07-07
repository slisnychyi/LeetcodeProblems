package contest;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import static java.time.temporal.ChronoUnit.MINUTES;

public class FinalPriceWithDiscount {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new FinalPriceWithDiscount().finalPrices(new int[]{8, 4, 6, 2, 3})));


//        List.of(1, 2, -1, Integer.MAX_VALUE).stream().map(e -> e | -e).forEach(System.out::println);


        Instant now = Instant.now();
        Instant plusSeconds = Instant.now().plusSeconds(120);
//        Duration between = Duration.between(now, plusSeconds);
//        System.out.println(between.get(MINUTES));

        System.out.println(MINUTES.between(now, plusSeconds));
        System.out.println(MINUTES.between(plusSeconds, now));
    }


    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            int val = prices[i];
            boolean changed = false;
            for(int j = i + 1; j < prices.length; j++){
                if(val >= prices[j]){
                    res[i] = val - prices[j];
                    changed = true;
                    break;
                }
            }
            if(!changed) res[i] = val;
        }
        return res;
    }
}
