package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeWheels;

public enum WheelSizeMazda implements AbleToChangeWheels {
    R15("R15"),
    R16("R16"),
    R17("R17");

    private String size;

    private WheelSizeMazda(String size) {
        this.size = size;
    }

    public String getWheelSize() {
        return size;
    }
}
