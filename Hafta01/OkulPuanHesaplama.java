package Hafta01;

import java.util.Random;

public class OkulPuanHesaplama {
    public static void main(String[] args) {
        Random random = new Random();

        int not = random.nextInt(101);
        System.out.println("notunuz: "+not);

        if(not>70 && not<=100){
            System.out.println("Harf notunuz AA");
        }else if(not>50 && not<=70){
            System.out.println("Harf notunuz BB");
        }else if(not>35 && not<=50){
            System.out.println("Harf notunuz DC");
        }else{
            System.out.println("Harf notunuz FF");
        }
    }
}
