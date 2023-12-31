package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

public enum WheelSizeBMW implements AbleToChangeWheels {
    R16("R16"),
    R17("R17"),
    R18("R18");

    private String size;

    private WheelSizeBMW(String size) {
        this.size = size;
    }

    public String getWheelSize() {
        return size;
    }
}
