package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeOptions;

public enum OptionMazda implements AbleToChangeOptions {
    MASSAGE_SEAT("кресло с массажем"),
    PARKTRONIC("парктроник");

    private String option;

    private OptionMazda(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
