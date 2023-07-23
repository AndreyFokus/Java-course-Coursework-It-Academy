package JavaCourseITAcademy;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.enums.*;
import JavaCourseITAcademy.factories.FactoryBMW;
import JavaCourseITAcademy.store.Store;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        FactoryBMW factoryBMW = new FactoryBMW();
        factoryBMW.printModels();
        factoryBMW.printColors();
        factoryBMW.printSizes();
        factoryBMW.printCapacity();

        Store store = new Store();
        Car car = store.createOrder(Label.FERRARI, ModelFerrari.F8_TRIBUTO, 2020, Capacity.LARGE, ColorFerrari.BLUE, WheelSizeFerrari.R18);
        System.out.println("Машина 1: " + car);
        Car car2 = store.createOrder(Label.BMW, ModelFerrari.F8_SPIDER, 2019, Capacity.LARGE, ColorMazda.BLACK, WheelSizeBMW.R17);
        System.out.println("Машина 2: " + car2);


        store.addNewOptionInCar(car, OptionFerrari.HEADLIGHT_WASHER);
        store.removeOptionInCar(car, OptionBMW.CRUISECONTROL);


        Set<OptionFerrari> list = new HashSet<>();
        list.add(OptionFerrari.HEADLIGHT_WASHER);
        list.add(OptionFerrari.HEATED_SEAT);

        store.setNewOptionsInCar(car, list);
        System.out.println("Машина 1: " + car);


        store.changeCarWheelSize(car, WheelSizeFerrari.R19);
        store.changeColorCar(car, ColorMazda.BLACK);
        System.out.println("Машина 1: " + car);
    }
}
