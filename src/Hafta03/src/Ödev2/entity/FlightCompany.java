package Hafta03.src.Ödev2.entity;

import java.util.HashSet;

public class FlightCompany {

    private HashSet fullSeat = new HashSet<>();
    private HashSet emptySeat = new HashSet<>();
    public HashSet getFullSeat() {
        return fullSeat;
    }
    public void setFullSeat(String fullSeat) {
        this.fullSeat.add(fullSeat);
    }
    public HashSet getEmptySeat() {
        return emptySeat;
    }
    public void setEmptySeat(HashSet emptySeat) {
        this.emptySeat = emptySeat;
    }
}
