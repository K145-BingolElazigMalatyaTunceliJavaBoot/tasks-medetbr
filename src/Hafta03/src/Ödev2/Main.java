package Hafta03.src.Ödev2;

import Ödev2.service.IFlightService;
import Ödev2.service.PegasusService;
import Ödev2.service.THYService;

public class Main {
    public static void main(String[] args) {
        IFlightService pegasusService = new PegasusService();
        System.out.println("Boş koltuklar "+pegasusService.getEmptySeat());
        System.out.println("Dolu koltuklar "+pegasusService.getFullSeat());
        pegasusService.buy("C1");
        pegasusService.getFood();
        System.out.println("****************");
        IFlightService thyService = new THYService();
        System.out.println("Boş koltuklar " + thyService.getEmptySeat());
        System.out.println("Dolu koltuklar "+ thyService.getFullSeat());
        thyService.buy("C2");
        thyService.getFood();
    }
}
