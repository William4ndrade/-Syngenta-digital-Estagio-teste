package Classes;

import Enuns.ClientType;

import java.util.*;

public class ReservationDetails {

    private ClientType clientType;
    private List<ReservationDays> ReservationDays;
    private int HowManyDays;

    public ReservationDetails(String ReservationDetails) {
        setClientType(ReservationDetails);
        SetReservationDays(ReservationDetails);
    }

    private void SetReservationDays(String s){
        String RemoveClientType = s.split(":")[1];
        String reservations[] = RemoveClientType.split(",");
        this.HowManyDays = reservations.length;
        List<ReservationDays> Rd = new ArrayList<>();
        for (String cd: reservations) {
            String currentDate = cd.trim();
            int day = Integer.parseInt(currentDate.substring(0, 2));
            String month = currentDate.substring(2,5);
            int year = Integer.parseInt(currentDate.substring(5,9));
            String WeekDay = currentDate.substring(currentDate.indexOf("(") + 1, currentDate.indexOf(")"));
            Rd.add(new ReservationDays(day, month, year, WeekDay));
        }
        this.ReservationDays = Rd;
    }

    private void setClientType(String s){
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(s);
            String CurrentClientType =  stringTokenizer.nextToken(":");
            this.clientType = ClientType.valueOf(CurrentClientType.toUpperCase());
        }catch (IllegalArgumentException ex){
            System.out.printf(">> Tipo de cliente inexistente <<");
        }
    }

    public ClientType getClientType() {
        return clientType;
    }

    public List<Classes.ReservationDays> getReservationDays() {
        return ReservationDays;
    }

    public int getHowManyDays() {
        return HowManyDays;
    }
}
