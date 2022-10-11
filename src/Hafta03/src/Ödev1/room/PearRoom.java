package Hafta03.src.Ödev1.room;

import Hafta03.src.Ödev1.fruit.Fruit;

public class PearRoom extends FruitRoom{
    private Fruit fruit;

    public PearRoom(Fruit fruit) {
        this.fruit = fruit;
    }
    public void add(float amount){
        if(amount<1){
            System.out.println("geçerli bir değer girin");
            return;
        }
        fruit.setAmount(fruit.getAmount()+amount);
        System.out.println("Depoya armut eklendi");
    }
    public void subtract(float amount){
        if(fruit.getAmount()<amount){
            System.out.println(fruit.getAmount()+" miktardan fazla armut satın alamazsınız");
            return;
        }
        fruit.setAmount(fruit.getAmount()-amount);
        System.out.println("Armut satın alındı");
        this.getStock();
    }
    public void getStock(){
        System.out.println("Depoda "+fruit.getAmount()+" kilo armut mevcut");
    }
}
