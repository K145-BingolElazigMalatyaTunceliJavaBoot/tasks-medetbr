package Hafta02.car;

import customer.Citizen;
import customer.Customer;

public class Hatchback extends Vehicle {
    public Hatchback( String brand,String model, int age,int km, String color, int topSpeed) {
        super(brand, model, age, km, color, topSpeed);
    }

//    @Override
//    public void rent(Customer customer, int days) {
//     if(days>1){
//         System.out.println("car.Hatchback tipindeki arabalar sadece 1 gün kiralanabilir..");
//     }
//     if(customer.getClass()== Citizen.class){
//         if (((Citizen) customer).isStudent()){
//             int currentPrice = super.getCalculatePrice(days);
//             System.out.println(currentPrice-currentPrice*10/100);
//         }
//     }
//    }
}
