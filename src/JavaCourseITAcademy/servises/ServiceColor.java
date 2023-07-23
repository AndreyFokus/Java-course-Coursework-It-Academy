package JavaCourseITAcademy.servises;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.interfaces.AbleToChangeColor;

public class ServiceColor implements Service<AbleToChangeColor> {
    public void changeCar(Car car, AbleToChangeColor color) {
        try {
            car.setColor(color);
        } catch (ClassCastException e){
            System.out.println("Вы не можете выбрать этот цвет.");
        }
    }
}