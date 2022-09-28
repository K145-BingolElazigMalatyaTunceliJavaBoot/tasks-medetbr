package Hafta02.car;

public abstract class Vehicle {
    private String model;
    private String brand;
    private String color;
    private int topSpeed;
    private int age;
    private int km;
    public Vehicle( String brand,String model, int age,int km, String color, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.topSpeed = topSpeed;
        this.color = color;
        this.km = km;
    }
    public void getInfo(){
        System.out.println("Aracın markası "+this.brand);
        System.out.println("Aracın modeli "+this.model);
        System.out.println("Aracın yaşı "+this.age);
        System.out.println("Aracın km "+this.km);
        System.out.println("Aracın rengi "+this.color);
        System.out.println("Aracın en yüksek hızı "+this.topSpeed+" km/h");
        System.out.println("Aracın Günlük ücreti "+this.getCalculatePrice(1));
        System.out.println("Aracın Aylık ücreti "+this.getCalculatePrice(30));
        System.out.println("****************************");
    }
        public int getCalculatePrice(int days){
          int basePrice = days*1850;
          basePrice -= days*((this.km>300000?300:this.km/1000 )+ (this.age>22? 22*50:this.age*50));
          if (days>29)basePrice-=basePrice*23/100;
          else if(days>13)basePrice-=basePrice*14/100;
          else if(days>7)basePrice-=basePrice*8/100;
          return basePrice;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
}
