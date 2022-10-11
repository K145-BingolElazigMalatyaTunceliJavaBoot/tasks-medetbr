package Hafta03.src.Ödev2.service;


import Ödev2.entity.Pegasus;

import java.util.HashSet;

public class PegasusService implements IFlightService{

    Pegasus pegasus = new Pegasus();
    @Override
    public void buy(String seatNumber) {
            boolean isSelectedSeat = pegasus.getFullSeat().contains(seatNumber);
            if (isSelectedSeat) System.out.println("Bu koltuk zaten satın alınmış");
            else {
                pegasus.getEmptySeat().remove(seatNumber);
                pegasus.setFullSeat(seatNumber);
                System.out.println("Bilet başarılı bir şekilde satın alındı");
            }
        }
    public HashSet getEmptySeat(){
        return pegasus.getEmptySeat();
    }
    public HashSet getFullSeat(){
        return pegasus.getFullSeat();
    }
    public void getFood(){
        System.out.println("Yemek servisimiz sadece yurt dışı seyahatlarında mevcuttur.");
    }
}
