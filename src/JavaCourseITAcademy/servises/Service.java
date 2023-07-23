package JavaCourseITAcademy.servises;

import JavaCourseITAcademy.cars.Car;

public interface Service<T> {
    public void changeCar(Car car, T o);
}
