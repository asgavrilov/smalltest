import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] prices = {40, 45, 34, 42, 50, 20, 35};
        System.out.println(analyzePrices(prices));
    }

    static Result analyzePrices(int[] array) {
        return findBest(findBestProfit(array));
    }

    private static List<Result> findBestProfit(int[] array) {
        List<Result> prelRes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int res = array[j] - array[i];
                prelRes.add(new Result(i + 1, j + 1, res));
            }
        }
        return prelRes;
    }

    private static Result findBest(List<Result> prelRes) {
        Result maxObj = null;
        int max = 0;
        for (int i = 0; i < prelRes.size(); i++) {
            if (prelRes.get(i).getProfit() > max) {
                max = prelRes.get(i).getProfit();
                maxObj = prelRes.get(i);
            }
        }
        return maxObj;
    }
}
