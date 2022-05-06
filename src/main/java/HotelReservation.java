import Classes.Hotel;
import Classes.HotelFactory;
import Classes.ReservationDetails;
import Enuns.HotelType;

import java.util.Arrays;
import java.util.List;

public class HotelReservation {

    private Hotel Lakewood = HotelFactory.GetHotel(HotelType.Lakewood);
    private Hotel Bridgewood = HotelFactory.GetHotel(HotelType.Bridgewood);
    private Hotel Ridgewood = HotelFactory.GetHotel(HotelType.Ridgewood);

    private List<Hotel> Allhotels = Arrays.asList(Lakewood, Bridgewood, Ridgewood);


    public String getCheapestHotel (String input) {
        ReservationDetails CurrentReservationDetails = new ReservationDetails(input);
        Hotel CheapestHotel = null;
        for (Hotel h : Allhotels) {
            if(CheapestHotel == null){
                CheapestHotel = h;
            }
            int CurrentValue = h.CalculateReservationValue(CurrentReservationDetails).intValue();
            int CurrentCheapestHotel = CheapestHotel.CalculateReservationValue(CurrentReservationDetails).intValue();

           if(CurrentValue < CurrentCheapestHotel){
               CheapestHotel = h;
               continue;
           }
            if(CurrentValue == CurrentCheapestHotel){
                if(h.getClassification() > CheapestHotel.getClassification()){
                    CheapestHotel = h;
                }
            }

        }
        return CheapestHotel.getHotelName();
    }
}
