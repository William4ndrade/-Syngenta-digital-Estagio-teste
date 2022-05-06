public class Main {


    public static void main(String[] args) {
        HotelReservation hr = new HotelReservation();
        String hotelname =  hr.getCheapestHotel("Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)");
        System.out.printf(hotelname);
    }
}
