package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeColor;

public enum ColorMazda implements AbleToChangeColor {
    GREY("серый"),
    GOLD("золотой"),
    BLACK("черный");

    private String color;

    private ColorMazda(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
