package Hafta02.customer;

import Hafta02.car.Vehicle;


public class Customer {
    private Vehicle vehicle;
    private int days;
    private int currentPrice;
    private String name;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void rent(Vehicle vehicle, int days){

    }
    public void getRentalCar(){
        if (getVehicle()==null){
            System.out.println("Kiralık bir aracınız yok henüz, kiralamak için rent metodunu kullanın");
            return;
        }
        System.out.println("\nAracın Markası: "+ vehicle.getBrand());
        System.out.println("Aracın Modeli: "+ vehicle.getModel());
        System.out.println("Kiralandığı gün sayısı: "+ this.days);
        System.out.println("Kiralandığı fiyat: "+ this.currentPrice);
        System.out.println("Kim tarafından kiralandı: "+ this.getName());
    }
}
