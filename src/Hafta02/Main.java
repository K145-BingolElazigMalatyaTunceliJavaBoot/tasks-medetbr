package Hafta02;

import Hafta02.car.Hatchback;
import Hafta02.car.Sedan;
import Hafta02.car.Suv;
import Hafta02.customer.Citizen;
import Hafta02.customer.Company;


public class Main {
    public static void main(String[] args) {

        //3 tane Sedan tipinde araba oluşturalım
        Sedan sedan  = createSedan("Toyota","Corolla",6,157000,"Beyaz",195);
        Sedan sedan1 = createSedan("Bmw","520d",12,210000,"Beyaz",230);
        Sedan sedan2 = createSedan("Audi","A4",4,85000,"Siyah",250);

        //3 tane Hatchback tipinde araba oluşturalım
        Hatchback hatchback  = createHatchback("Audi","A3",7,165000,"Beyaz",230);
        Hatchback hatchback1 = createHatchback("Volkswagen","Polo",10,240000,"Kırmızı",225);
        Hatchback hatchback2 = createHatchback("Seat","Leon",8,225000,"Beyaz",240);

        // 3 tane de Suv tipinde araç oluşturalım
        Suv suv  = createSuv("Dacia","Duster",5,17000,"Mavi",190);
        Suv suv1 = createSuv("Nissan","Qashqai",9,240000,"Beyaz",190);
        Suv suv2 = createSuv("Land Rover","Range Rover",12,270000,"Siyah",185);

        // Şirket sınıfından bir tane nesne oluşturalım
        Company company = new Company("Şirket nesnesi");

        // Vatandaş sınıfından bir tane nesne oluşturalım
        Citizen citizen = new Citizen("Vatandaş nesnesi(Öğrenci)",true);
        Citizen citizen1 = new Citizen("Vatandaş nesnesi(Normal)",false);

        hatchback.getInfo();
        citizen.rent(hatchback,1);
        citizen.getRentalCar();
        //company.rent(suv1,12);
        //company.getRentalCar();
    }


    public static Sedan createSedan(String brand,String model,int age,int km,String color,int topSpeed){
       return new Sedan(brand,model,age,km,color,topSpeed);
    }
    public static Hatchback createHatchback(String brand,String model,int age,int km,String color,int topSpeed){
        return new Hatchback(brand,model,age,km,color,topSpeed);
    }
    public static Suv createSuv(String brand,String model,int age,int km,String color,int topSpeed){
        return new Suv(brand,model,age,km,color,topSpeed);
    }
}