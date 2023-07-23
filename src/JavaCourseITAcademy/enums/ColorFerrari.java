package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeColor;

public enum ColorFerrari implements AbleToChangeColor {
    YELLOW("желтый"),
    ROSE("розовый"),
    BLUE("голубой");

    private String color;

    private ColorFerrari(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
