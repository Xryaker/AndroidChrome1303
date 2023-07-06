package config;

public enum DEVICES {
    PIXEL("PIXEL"),
    PIXE4("Pixel4");

    public String getName() {
        return name;
    }

     String name;

    DEVICES(String name) {
        this.name = name;
    }

}
