package Classes;

import Enuns.ClientType;

import java.math.BigDecimal;

public class Hotel {

    private String HotelName;
    private int classification;
    private Prices prices;


    private BigDecimal CalculateRewardReservationValue(ReservationDetails rs){
        BigDecimal value = new BigDecimal("0");
        for (ReservationDays rd: rs.getReservationDays()) {
            if(rd.getIsWeekend()){
                value = value.add(prices.getWeekendValueForRewardClient());
            }else{
                value = value.add(prices.getWeekDayValueForRewardClient());
            }

        }
        return value;
    }

    private BigDecimal CalculateRegularReservationValue(ReservationDetails rd){
        BigDecimal value = new BigDecimal("0");
        for (ReservationDays rs: rd.getReservationDays()){
            if(rs.getIsWeekend()){
                value = value.add(prices.getWeekendValueForRegularClient());
            }else{
                value = value.add(prices.getWeekDayValueForRegularClient());
            }
        }
        return value;
    }

    public BigDecimal CalculateReservationValue(ReservationDetails reservationDetails){
        if(reservationDetails.getClientType() == ClientType.REWARDS){
            return CalculateRewardReservationValue(reservationDetails);
        }
        return CalculateRegularReservationValue(reservationDetails);
    }

    public Hotel(String hotelName, int classification, Prices prices) {
        HotelName = hotelName;
        this.classification = classification;
        this.prices = prices;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }
}
