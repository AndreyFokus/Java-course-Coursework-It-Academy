package JavaCourseITAcademy.enums;

import JavaCourseITAcademy.interfaces.AbleToChangeOptions;

public enum OptionFerrari implements AbleToChangeOptions {
    HEATED_SEAT("подогрев сиденья"),
    HEADLIGHT_WASHER("омыватель фар");

    private String option;

    private OptionFerrari(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
