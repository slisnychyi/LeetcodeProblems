package interview.mock;

public class FloodRoad {

    //find number of ways to jump to n position
    // for example for position 5, we can jump
    // 1-1-1-1-1, 1-1-1-2, 1-2-1-1, 1-1-2-1, 2-1-1-1, 2-2-1, 2-1-2, 1-2-2
    // 1-1-1-1 2-2 1-2-1 2-1-1 1-1-2
    public int getNumberOfWaysForTwoJumps(int position) {
        if (position < 2) return 1;
        return getNumberOfWaysForTwoJumps(position - 1) + getNumberOfWaysForTwoJumps(position - 2);
    }

    //3 1-1-1 1-2 2-1
    public int getNumberOfWaysForThreeJumps(int position) {
        if (position < 2) return 1;
        if (position == 2) return 2;
        return getNumberOfWaysForThreeJumps(position - 1) + getNumberOfWaysForThreeJumps(position - 2) + getNumberOfWaysForThreeJumps(position - 3);
    }

    public int getNumberOfWaysForTwoJumps(int position, int jumps) {
        if (position < 0) return 0;
        if (position < 2) return 1;
        int sum = 0;
        for (int i = 1; i <= jumps; i++) {
            sum += getNumberOfWaysForTwoJumps(position - i, jumps);
        }
        return sum;
    }


    // # 1 - какие значения мы вычисляем ? a[n] - количество способов допрыгать до n столбика
    // # 2 - как их пересчитывать ? какое рекурентное соотношение
    // # 3 - какие начальные значения
    // # 4 - в каком порядке вычислять значения ?
    // # 5 - где искать ответ


    public int getNumberOfWaysForNJumps(int position, int kJumps) {
//        if (position == 0) return 1;
////        if (position < 2) return 1;
//        int result = 0;
//        for (int i = 1; i < position; i++) {
//            int r = kJumps;
//            if(r > i) r = i;
//            for (int j = 1; j < r; j++) {
//                result += getNumberOfWaysForNJumps(, kJumps);
//            }
//        }
//        return result;
        return 0;
    }


}
