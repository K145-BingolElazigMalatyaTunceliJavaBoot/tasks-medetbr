package Hafta01;

import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        while(true){
            int randomSayi = random.nextInt(0,500);
            count++;
            if(randomSayi>50 && randomSayi<100) {
                System.out.println(randomSayi+" sayısı " + count + " denemede bulundu."); break;
            }
        }
    }
}
