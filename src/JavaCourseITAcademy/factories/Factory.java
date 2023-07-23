package JavaCourseITAcademy.factories;

import JavaCourseITAcademy.cars.Car;
import JavaCourseITAcademy.enums.Capacity;
import JavaCourseITAcademy.interfaces.AbleToChangeColor;
import JavaCourseITAcademy.interfaces.AbleToChangeOptions;
import JavaCourseITAcademy.interfaces.AbleToChangeWheels;
import JavaCourseITAcademy.servises.ServiceColor;
import JavaCourseITAcademy.servises.ServiceOption;
import JavaCourseITAcademy.servises.ServiceWheelSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public abstract class Factory<T> {
    Storage storage;

    ServiceWheelSize serviceWheelSize = new ServiceWheelSize();
    ServiceColor serviceColor = new ServiceColor();
    ServiceOption serviceOption = new ServiceOption();

    List<T> modelList;
    List<Capacity> capacityList;
    List<AbleToChangeColor> colorList;
    List<AbleToChangeWheels> sizeList;
    List<AbleToChangeOptions> optionsList;

    public Factory() {
        capacityList = new ArrayList<>();
        capacityList.addAll(Arrays.asList(Capacity.values()));
        colorList = new ArrayList<>();
        sizeList = new ArrayList<>();
        optionsList = new ArrayList<>();
        modelList = new ArrayList<>();
    }

    public Storage getStorage() {
        return storage;
    }

    public List<Car> getCarsFromStorage() {
        return storage.getStorage();
    }

    public abstract void printCapacity();

    public abstract void printModels();

    public abstract void printColors();

    public abstract void printSizes();

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