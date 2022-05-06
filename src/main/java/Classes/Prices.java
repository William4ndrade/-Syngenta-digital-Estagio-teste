package Classes;

import java.math.BigDecimal;

public class Prices {

    private BigDecimal WeekDayValueForRegularClient;
    private BigDecimal WeekDayValueForRewardClient;
    private BigDecimal WeekendValueForRegularClient;
    private BigDecimal WeekendValueForRewardClient;

    public Prices(int weekDayValueForRegularClient, int weekDayValueForRewardClient, int weekendValueForRegularClient, int weekendValueForRewardClient) {
        WeekDayValueForRegularClient = new BigDecimal(weekDayValueForRegularClient);
        WeekDayValueForRewardClient = new BigDecimal(weekDayValueForRewardClient);
        WeekendValueForRegularClient = new BigDecimal(weekendValueForRegularClient);
        WeekendValueForRewardClient = new BigDecimal(weekendValueForRewardClient);
    }

    public BigDecimal getWeekDayValueForRegularClient() {
        return WeekDayValueForRegularClient;
    }

    public void setWeekDayValueForRegularClient(BigDecimal weekDayValueForRegularClient) {
        WeekDayValueForRegularClient = weekDayValueForRegularClient;
    }

    public BigDecimal getWeekDayValueForRewardClient() {
        return WeekDayValueForRewardClient;
    }

    public void setWeekDayValueForRewardClient(BigDecimal weekDayValueForRewardClient) {
        WeekDayValueForRewardClient = weekDayValueForRewardClient;
    }

    public BigDecimal getWeekendValueForRegularClient() {
        return WeekendValueForRegularClient;
    }

    public void setWeekendValueForRegularClient(BigDecimal weekendValueForRegularClient) {
        WeekendValueForRegularClient = weekendValueForRegularClient;
    }

    public BigDecimal getWeekendValueForRewardClient() {
        return WeekendValueForRewardClient;
    }

    public void setWeekendValueForRewardClient(BigDecimal weekendValueForRewardClient) {
        WeekendValueForRewardClient = weekendValueForRewardClient;
    }
}
