public class LightingControlFacade {
    private LightingSystem lightingSystem;

    public LightingControlFacade() {
        lightingSystem = new LightingSystem();
    }

    public void addZone(String zoneName) {
        lightingSystem.addZone(zoneName);
    }

    public void setZoneBrightness(String zoneName, int brightness) {
        LightZone zone = lightingSystem.getZone(zoneName);
        if (zone != null) {
            zone.setBrightness(brightness);
        } else {
            System.out.println("Zone " + zoneName + " not found.");
        }
    }

    public void setZoneColor(String zoneName, String color) {
        LightZone zone = lightingSystem.getZone(zoneName);
        if (zone != null) {
            zone.setColor(color);
        } else {
            System.out.println("Zone " + zoneName + " not found.");
        }
    }

    public int getZoneBrightness(String zoneName) {
        LightZone zone = lightingSystem.getZone(zoneName);
        if (zone != null) {
            return zone.getBrightness();
        } else {
            System.out.println("Zone " + zoneName + " not found.");
            return -1; // Error value
        }
    }

    public String getZoneColor(String zoneName) {
        LightZone zone = lightingSystem.getZone(zoneName);
        if (zone != null) {
            return zone.getColor();
        } else {
            System.out.println("Zone " + zoneName + " not found.");
            return null; // Error value
        }
    }
}
