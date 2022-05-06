package Classes;

import Enuns.HotelType;

public class HotelFactory {

    private static Prices LakewoodPrices = new Prices(110, 80, 90, 80);
    private static Prices BridgeWoodPrices = new Prices(160, 110, 60, 50);
    private static Prices RidgewoodPrices = new Prices(220, 100, 150, 40);



    public static Hotel GetHotel(HotelType hotel){

        if(hotel.equals(HotelType.Lakewood)) return new Hotel("Lakewood", 3, LakewoodPrices);
        if(hotel.equals(HotelType.Bridgewood)) return new Hotel("Bridgewood", 4, BridgeWoodPrices);
        if(hotel.equals(HotelType.Ridgewood)) return new Hotel("Ridgewood", 5, RidgewoodPrices);

        return null;


    }

}
