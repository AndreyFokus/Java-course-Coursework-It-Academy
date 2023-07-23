package JavaCourseITAcademy.cars;


import JavaCourseITAcademy.enums.*;

import java.util.HashSet;
import java.util.Set;

public class Mazda extends Car<OptionMazda, ColorMazda, WheelSizeMazda, ModelMazda> {
    private ColorMazda colorMazda;
    private WheelSizeMazda wheelSizeMazda;
    private ModelMazda modelMazda;
    public Set<OptionMazda> optionsMazda;

    public Mazda(ModelMazda modelMazda, int year, Capacity engineCapacity, ColorMazda colorMazda, WheelSizeMazda wheelSizeMazda, Set<OptionMazda> optionMazda) {
        super(Label.MAZDA, year, engineCapacity);
        this.modelMazda = modelMazda;
        this.colorMazda = colorMazda;
        this.wheelSizeMazda = wheelSizeMazda;
        this.optionsMazda = optionMazda;
    }

    public Mazda(ModelMazda modelMazda, int year, Capacity engineCapacity, ColorMazda colorMazda, WheelSizeMazda wheelSizeMazda) {
        super(Label.MAZDA, year, engineCapacity);
        this.modelMazda = modelMazda;
        this.colorMazda = colorMazda;
        this.wheelSizeMazda = wheelSizeMazda;
        this.optionsMazda = new HashSet<>();
    }

    public ModelMazda getModel() {
        return modelMazda;
    }

    public ColorMazda getColor() {
        return colorMazda;
    }

    public void setColor(ColorMazda colorMazda) {
        this.colorMazda = colorMazda;
    }

    public WheelSizeMazda getWheelSize() {
        return wheelSizeMazda;
    }

    public void setWheelSize(WheelSizeMazda wheelSizeMazda) {
        this.wheelSizeMazda = wheelSizeMazda;
    }

    public Set<OptionMazda> getOptionsMazda() {
        return optionsMazda;
    }

    public void setOptions(Set<OptionMazda> optionsMazda) {
        this.optionsMazda = optionsMazda;
    }

    public void addOption(OptionMazda optionMazda) {
        if (!optionsMazda.contains(optionMazda)) {
            this.optionsMazda.add(optionMazda);
        } else {
            System.out.println("В этой машине уже есть такая опция.");
        }
    }

    public void removeOption(OptionMazda optionMazda) {
        if (optionsMazda.contains(optionMazda)) {
            this.optionsMazda.remove(optionMazda);
        } else {
            System.out.println("В этой машине нет такой опции.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Модель: " + modelMazda + " Цвет: " + colorMazda + " Размер колес: " + wheelSizeMazda + " Доп.опции: " + optionsMazda + " ";
    }
}
