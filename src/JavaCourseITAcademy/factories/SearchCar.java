package JavaCourseITAcademy.factories;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.enums.Capacity;
import JavaCourseITAcademy.enums.Label;
import JavaCourseITAcademy.interfaces.AbleToChangeColor;
import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

public interface SearchCar<T, S extends AbleToChangeColor, U extends AbleToChangeWheels> {
    public Car searchInStorage(Label label, T model, int year, Capacity capacity, S color, U wheels);
}
