package JavaCourseITAcademy.enums;

public enum Label {
    BMW("БМВ"),
    MAZDA("Мазда"),
    FERRARI("Феррари");

    private String label;

    private Label(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
