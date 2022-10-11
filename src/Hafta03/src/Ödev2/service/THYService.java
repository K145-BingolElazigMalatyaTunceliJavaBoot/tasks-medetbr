package Hafta03.src.Ödev2.service;

import Hafta03.src.Ödev2.entity.THY;

import java.util.HashSet;

public class THYService implements IFlightService{
    private THY thy = new THY();
    @Override
    public void buy(String seatNumber) {
        boolean isSelectedSeat = thy.getFullSeat().contains(seatNumber);
        if (isSelectedSeat) System.out.println("Bu koltuk zaten satın alınmış");
        else {
            thy.getEmptySeat().remove(seatNumber);
            thy.setFullSeat(seatNumber);
            System.out.println("Bilet başarılı bir şekilde satın alındı");
        }
    }

    @Override
    public HashSet getEmptySeat() {
        return thy.getEmptySeat();
    }

    @Override
    public HashSet getFullSeat() {
        return thy.getFullSeat();
    }

    @Override
    public void getFood() {
        System.out.println("Yemek servisimiz yurt içi ve yurt dışı mevcuttur.");
    }
}
