package Hafta01;

public class AsalSayiToplam {
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 3; i <100 ; i++) {
            for (int j = 2; j < i ; j++) {
                if(i%j==0)break;
                if(j==i-1) toplam+=i;
            }
        }
        System.out.println("3 ile 100 arasındaki asal sayıların toplamı: "+ toplam);
    }
}
