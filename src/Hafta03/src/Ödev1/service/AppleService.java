package Hafta03.src.Ödev1.service;

import Ödev1.room.FruitRoom;

public class AppleService {
    FruitRoom fruitRoom;

    public AppleService(FruitRoom fruitRoom) {
        this.fruitRoom = fruitRoom;
    }

    public void buy(float amount){
        fruitRoom.subtract(amount);
    }
}
