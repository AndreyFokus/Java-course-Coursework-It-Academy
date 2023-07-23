package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

public enum WheelSizeFerrari implements AbleToChangeWheels {
    R17("R17"),
    R18("R18"),
    R19("R19");

    private String size;

    private WheelSizeFerrari(String size) {
        this.size = size;
    }

    public String getWheelSize() {
        return size;
    }
}
