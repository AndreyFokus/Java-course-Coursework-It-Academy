package JavaCourseITAcademy.servises;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.interfaces.AbleToChangeOptions;

import java.util.Set;

public class ServiceOption implements Service<AbleToChangeOptions> {

    public <T extends AbleToChangeOptions> void setNewListOptions(Car car, Set<T> list) {
        try {
            car.setOptions(list);
        } catch (ClassCastException e) {
            System.out.println("Вы не можете добавить эти опции.");
        }
    }

    public void changeCar(Car car, AbleToChangeOptions o) {
        try {
            car.addOption(o);
        } catch (ClassCastException e) {
            System.out.println("Вы не можете добавить эту опцию.");
        }
    }

    public void removeOption(Car car, AbleToChangeOptions o) {
        try {
            car.removeOption(o);
        } catch (ClassCastException e) {
            System.out.println("Вы не можете удалить эту опцию.");
        }
    }
}
