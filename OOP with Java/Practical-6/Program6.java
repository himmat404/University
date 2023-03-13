//abstract super class
abstract class MotorBike {
    //abstract method
    abstract void brake();
}
class SportsBike extends MotorBike {

    //implementation of abstract method
    public void brake(){
        System.out.println("SportsBike Brake");
    }
}
class MountainBike extends MotorBike {

    //implementation of abstract method
    public void brake(){
        System.out.println("MountainBike Brake");
    }
}

class Program6 {
    public static void main(String[] args) {
        
        // create an object of Mountain Bike class
        MountainBike RE_Himalayan_650 = new MountainBike();
        RE_Himalayan_650.brake();

        // create an object of Sports Bike class
        SportsBike BMW_G310_RR = new SportsBike();
        BMW_G310_RR.brake();

    }
}