import Classes.Hotel;
import Classes.HotelFactory;
import Classes.ReservationDetails;
import Enuns.ClientType;
import Enuns.HotelType;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTests {


    @Test
    public void ReservationDetailsTest(){
        ReservationDetails rd = new ReservationDetails("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
        assertEquals("sat", rd.getReservationDays().get(2).getWeekDay());
        assertEquals(ClientType.REWARDS, rd.getClientType());
        assertEquals(3, rd.getHowManyDays());
        assertEquals(true, rd.getReservationDays().get(2).getIsWeekend() );
    }

    @Test
    public void CheckValuesTest(){
        ReservationDetails rd = new ReservationDetails("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
        Hotel h1 = HotelFactory.GetHotel(HotelType.Lakewood);
        Hotel h2 = HotelFactory.GetHotel(HotelType.Bridgewood);
        Hotel h3 = HotelFactory.GetHotel(HotelType.Ridgewood);

        assertEquals(240, h1.CalculateReservationValue(rd).intValue());
        assertEquals(270 , h2.CalculateReservationValue(rd).intValue());
        assertEquals( 240,h3.CalculateReservationValue(rd).intValue());




    }



}
