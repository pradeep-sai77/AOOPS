import java.util.HashMap;
import java.util.Map;

public class LightingSystem {
    private Map<String, LightZone> zones = new HashMap<>();

    public void addZone(String name) {
        zones.put(name, new LightZone(name));
        System.out.println("Zone " + name + " added to the system.");
    }

    public LightZone getZone(String name) {
        return zones.get(name);
    }
}
