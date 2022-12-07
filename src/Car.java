public class Car {
    int year = 2022;
    String make; //ยี่ห้อ
    String model;
    int speed = 1000;
    void printSpeed(){
        System.out.println("The current speed :"+speed);
    }
    Car(){
        this(_speed:
        0);
    }
    Car(int _speed){
        this.speed = _speed;

    }
}
