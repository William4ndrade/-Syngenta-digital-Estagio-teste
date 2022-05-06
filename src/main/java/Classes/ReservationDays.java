package Classes;

import java.util.Objects;

public class ReservationDays {

    private int day;
    private String month;
    private int year;
    private String WeekDay;

    private Boolean IsWeekend;

    public ReservationDays(int day, String month, int year, String weekDay) {
        this.day = day;
        this.month = month;
        this.year = year;
        WeekDay = weekDay;
        setIsWeekend();
    }

    public Boolean getIsWeekend() {
        return IsWeekend;
    }

    private void setIsWeekend() {
        if(this.WeekDay.equalsIgnoreCase("sat") || this.WeekDay.equalsIgnoreCase("sun")){
            this.IsWeekend = true;
            return;
        }

        this.IsWeekend = false;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservationDays)) return false;
        ReservationDays that = (ReservationDays) o;
        return getDay() == that.getDay() && Objects.equals(getMonth(), that.getMonth()) && Objects.equals(getYear(), that.getYear()) && Objects.equals(getWeekDay(), that.getWeekDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth(), getYear(), getWeekDay());
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "ReservationDays{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", WeekDay='" + WeekDay + '\'' +
                '}';
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWeekDay() {
        return WeekDay;
    }

    public void setWeekDay(String weekDay) {
        WeekDay = weekDay;
    }
}
