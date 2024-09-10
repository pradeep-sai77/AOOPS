public class LightZone {
    private String name;
    private int brightness; // 0 to 100
    private String color; // Hex color code like #FFFFFF for white

    public LightZone(String name) {
        this.name = name;
        this.brightness = 50; // default brightness
        this.color = "#FFFFFF"; // default white color
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Brightness of " + name + " set to " + brightness);
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color of " + name + " set to " + color);
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }
}