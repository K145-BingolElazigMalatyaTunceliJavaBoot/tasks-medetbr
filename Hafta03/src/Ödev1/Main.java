package Hafta03.src.Ödev1;

import Hafta03.src.Ödev1.fruit.Apple;
import Hafta03.src.Ödev1.fruit.Cherry;
import Hafta03.src.Ödev1.fruit.Pear;
import Hafta03.src.Ödev1.room.AppleRoom;
import Hafta03.src.Ödev1.room.CherryRoom;
import Hafta03.src.Ödev1.room.PearRoom;
import Hafta03.src.Ödev1.service.AppleService;
import Hafta03.src.Ödev1.service.CherryService;
import Hafta03.src.Ödev1.service.PearService;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(30);
        AppleRoom appleRoom = new AppleRoom(apple);
        AppleService appleService = new AppleService(appleRoom);
        appleRoom.add(25);
        appleRoom.getStock();
        appleService.buy(28);

        System.out.println("***************");

        Cherry cherry = new Cherry(15);
        CherryRoom cherryRoom = new CherryRoom(cherry);
        CherryService cherryService = new CherryService(cherryRoom);
        cherryRoom.add(18);
        cherryRoom.getStock();
        cherryService.buy(14);

        System.out.println("***************");

        Pear pear = new Pear(24);
        PearRoom pearRoom = new PearRoom(pear);
        PearService pearService = new PearService(pearRoom);
        pearRoom.add(17);
        pearRoom.getStock();
        pearService.buy(16);


    }
}