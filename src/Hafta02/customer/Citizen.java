package Hafta02.customer;

import car.Hatchback;
import car.Vehicle;

public class Citizen extends Customer{
    private String name;
    private boolean isStudent;

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Citizen(String name, boolean isStudent) {
        this.name = name;
        this.isStudent = isStudent;
    }

    @Override
    public void rent(Vehicle vehicle, int days) {
        if (vehicle.getClass() != Hatchback.class){
            System.out.println("\nBu kullanıcı sadece hatchback tipinde arabalar kiralayabilir");
            return;
        }
        if(days!=1){
            System.out.println("Hatchback tipindeki arabalar yalnızca 1 gün kiralanabilir.");
             return;
        }
        this.setVehicle(vehicle);
        this.setDays(days);
        if (this.isStudent()){
            this.setCurrentPrice(vehicle.getCalculatePrice(days)-vehicle.getCalculatePrice(days)*10/100);
            System.out.println("\n"+vehicle.getBrand()+" "+vehicle.getModel()+" "+days+" günlüğüne "
                    +" %10 öğrenci indirimi uygulanarak "+this.getCurrentPrice()+" fiyata kiralandı");
            return;
        }
        this.setCurrentPrice(vehicle.getCalculatePrice(days));
        System.out.println("\n"+vehicle.getBrand()+" "+vehicle.getModel()+" "+days+" günlüğüne "
                +this.getCurrentPrice()+" fiyata kiralandı");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
