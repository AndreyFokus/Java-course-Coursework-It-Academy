package JavaCourseITAcademy.servises;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

public class ServiceWheelSize implements Service<AbleToChangeWheels> {
    public void changeCar(Car car, AbleToChangeWheels wheels){
        try {
            car.setWheelSize(wheels);
        } catch (Exception e) {
            System.out.println("Вы не можете выбрать эти колеса.");
        }
    }
}
