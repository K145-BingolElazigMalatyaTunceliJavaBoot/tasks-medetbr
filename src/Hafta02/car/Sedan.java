package Hafta02.car;

import customer.Citizen;
import customer.Customer;

public class Sedan extends Vehicle {

    public Sedan(String brand,String model,int age,int km,String color,int topSpeed) {
        super(brand,model,age,km,color,topSpeed);
    }

//    @Override
//    public void rent(Customer customer, int days) {
//        if (days<1) {
//            System.out.println("Lütfen geçerli gün sayısı giriniz.");
//            return;
//        }
//        if(customer.getClass() == Citizen.class){
//            System.out.println("Bu araç vatandaşa kiralık verilmiyor");
//            return;
//        }
//        customer.getRentalCar();
//        System.out.println("Araç başarılı bir şekilde kiralandı");
//    }


}
