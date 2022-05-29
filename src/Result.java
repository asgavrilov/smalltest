public class Result {
    public Result(int buyingDay, int sellingDay, int profit) {
        this.sellingDay = sellingDay;
        this.buyingDay = buyingDay;
        this.profit = profit;
    }

    private final int buyingDay;
    private final int sellingDay;

    private final int profit;

    public int getSellingDay() {
        return sellingDay;
    }


    public int getBuyingDay() {
        return buyingDay;
    }


    public int getProfit() {
        return profit;
    }


    @Override
    public String toString() {
        return "Best time to: " +
                " \nbuy stock on day= " + buyingDay +
                ",\nto sell it on day= " + sellingDay +
                ", \nyou'll get a max profit=" + profit;
    }
}
