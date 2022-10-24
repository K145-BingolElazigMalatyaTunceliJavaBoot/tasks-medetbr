package Hafta03.src.Ödev2.service;

import java.util.HashSet;

public interface IFlightService {
    void buy(String seatNumber);
    HashSet getEmptySeat();
    HashSet getFullSeat();
    void getFood();
}
