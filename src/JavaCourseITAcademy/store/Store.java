package JavaCourseITAcademy.store;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.enums.*;
import JavaCourseITAcademy.factories.FactoryBMW;
import JavaCourseITAcademy.factories.FactoryFerrari;
import JavaCourseITAcademy.factories.FactoryMazda;
import JavaCourseITAcademy.interfaces.AbleToChangeColor;
import JavaCourseITAcademy.interfaces.AbleToChangeOptions;
import JavaCourseITAcademy.interfaces.AbleToChangeWheels;
import JavaCourseITAcademy.servises.ServiceColor;
import JavaCourseITAcademy.servises.ServiceOption;
import JavaCourseITAcademy.servises.ServiceWheelSize;

import java.util.Set;

public class Store {
    FactoryFerrari factoryFerrari = new FactoryFerrari();
    FactoryMazda factoryMazda = new FactoryMazda();
    FactoryBMW factoryBMW = new FactoryBMW();

    ServiceColor serviceColor = new ServiceColor();
    ServiceWheelSize serviceWheelSize = new ServiceWheelSize();
    ServiceOption serviceOption = new ServiceOption();

    public <T> Car createOrder(Label label, T model, int year, Capacity capacity, AbleToChangeColor color, AbleToChangeWheels wheels) {
        try {
            if (label == Label.BMW) {
                return factoryBMW.createCar(label, (ModelBMW) model, year, capacity, (ColorBMW) color, (WheelSizeBMW) wheels);
            } else if (label == Label.MAZDA) {
                return factoryMazda.createCar(label, (ModelMazda) model, year, capacity, (ColorMazda) color, (WheelSizeMazda) wheels);
            } else if (label == Label.FERRARI) {
                return factoryFerrari.createCar(label, (ModelFerrari) model, year, capacity, (ColorFerrari) color, (WheelSizeFerrari) wheels);
            }
        } catch (ClassCastException e) {
            System.out.print("Машина не создана. ");
        }
        System.out.println("Вы ввели неверные параметры.");
        return null;
    }

    public void changeColorCar(Car car, AbleToChangeColor color) {
        serviceColor.changeCar(car, color);
    }

    public void changeCarWheelSize(Car car, AbleToChangeWheels wheels) {
        serviceWheelSize.changeCar(car, wheels);
    }

    public <T extends AbleToChangeOptions> void setNewOptionsInCar(Car car, Set<T> options) {
        serviceOption.setNewListOptions(car, options);
    }

    public void addNewOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.changeCar(car, option);
    }

    public void removeOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.removeOption(car, option);
    }
}
