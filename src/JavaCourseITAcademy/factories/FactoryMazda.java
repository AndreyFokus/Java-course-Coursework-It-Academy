package JavaCourseITAcademy.factories;

import JavaCourseITAcademy.Main;
import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.cars.Mazda;
import JavaCourseITAcademy.enums.*;
import JavaCourseITAcademy.interfaces.AbleToChangeColor;
import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMazda extends Factory<ModelMazda> implements SearchCar<ModelMazda, ColorMazda, WheelSizeMazda>, CreateCar<ModelMazda, ColorMazda, WheelSizeMazda> {

    public FactoryMazda() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Mazda(ModelMazda.RX_7, 2019, Capacity.LARGE, ColorMazda.BLACK, WheelSizeMazda.R17));
        cars.add(new Mazda(ModelMazda.RX_8, 2020, Capacity.SMALL, ColorMazda.GREY, WheelSizeMazda.R15));
        cars.add(new Mazda(ModelMazda.Furai_Concept, 2020, Capacity.LARGE, ColorMazda.GOLD, WheelSizeMazda.R16));
        this.storage = new Storage(cars);

        this.colorList.addAll(Arrays.asList(ColorBMW.values()));
        this.sizeList.addAll(Arrays.asList(WheelSizeBMW.values()));
        this.optionsList.addAll(Arrays.asList(OptionBMW.values()));
        this.modelList.addAll(Arrays.asList(ModelMazda.values()));
    }

    @Override
    public Car createCar(Label label, ModelMazda modelMazda, int year, Capacity capacity, ColorMazda color, WheelSizeMazda wheels) {
        Car car = searchInStorage(label, modelMazda, year, capacity, color, wheels);
        if (car == null) {
            System.out.println("Создана новая машина:");
            car = new Mazda(modelMazda, year, capacity, color, wheels);
        }
        return car;
    }

    @Override
    public Car searchInStorage(Label label, ModelMazda modelMazda, int year, Capacity capacity, ColorMazda color, WheelSizeMazda wheels) {
        for (Car car : storage.getStorage()) {
            boolean isSame = car.getLabel().equals(label) && car.getModel().equals(modelMazda) && car.getYear() == year && car.getEngineCapacity().equals(capacity);
            if (isSame && car.getColor().equals(color) && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame && car.getColor().equals(color)) {
                Car tmp = car;
                serviceWheelSize.changeCar(tmp, wheels);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                serviceColor.changeCar(tmp, color);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame) {
                Car tmp = car;
                serviceColor.changeCar(tmp, color);
                serviceWheelSize.changeCar(tmp, wheels);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            }
        }
        System.out.println("В хранилище ничего не найдено.");
        return null;
    }

    public void printColors() {
        System.out.println("Список возможных цветов Mazda: ");
        for (AbleToChangeColor color : colorList) {
            System.out.println(color);
        }
    }

    public void printSizes() {
        System.out.println("Список возможных размеров колес Mazda: ");
        for (AbleToChangeWheels size : sizeList) {
            System.out.println(size);
        }
    }

    public void printCapacity() {
        System.out.println("Список возможных объемов двигателей Mazda: ");
        for (Capacity capacity : capacityList) {
            System.out.println(capacity);
        }
    }

    public void printModels() {
        System.out.println("Список возможных моделей Mazda: ");
        for (ModelMazda mazda : modelList) {
            System.out.println(mazda);
        }
    }
}
