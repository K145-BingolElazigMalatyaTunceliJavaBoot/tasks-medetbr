package Hafta02.customer;

import car.Vehicle;

public class Company extends Customer{
    private String name;
    public Company(String name) {
        this.name = name;
    }
    @Override
    public void rent(Vehicle vehicle, int days) {
        if (days<1){
            System.out.println("Geçerli bir gün sayısı giriniz");
            return;
        }
        this.setVehicle(vehicle);
        this.setDays(days);
        this.setCurrentPrice(vehicle.getCalculatePrice(days));
        System.out.println(vehicle.getBrand()+" "+vehicle.getModel()+" "+days+" günlüğüne "
                +this.getCurrentPrice()+" fiyata kiralandı");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
