package Hafta03.src.Ödev1.service;

import Hafta03.src.Ödev1.room.FruitRoom;

public class PearService {
    FruitRoom fruitRoom;

    public PearService(FruitRoom fruitRoom) {
        this.fruitRoom = fruitRoom;
    }

    public void buy(float amount){
        fruitRoom.subtract(amount);
    }
}
