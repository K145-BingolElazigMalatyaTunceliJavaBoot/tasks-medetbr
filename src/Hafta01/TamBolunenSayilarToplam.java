package Hafta01;

public class TamBolunenSayilarToplam {
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 200; i <500 ; i++) {
            if (i%3==0) continue;
            toplam+=i;
        }
        System.out.println("200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamı: "+ toplam);
    }
}
