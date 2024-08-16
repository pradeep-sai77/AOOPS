public class LightingControlFacadeMain {
    public static void main(String[] args) {
        LightingControlFacade facade = new LightingControlFacade();
        
        // Add zones
        facade.addZone("Living Room");
        facade.addZone("Bedroom");
        
        // Set brightness and color
        facade.setZoneBrightness("Living Room", 80);
        facade.setZoneColor("Bedroom", "#FF5733");

        // Retrieve and print current settings
        int livingRoomBrightness = facade.getZoneBrightness("Living Room");
        String bedroomColor = facade.getZoneColor("Bedroom");
        
        System.out.println("Living Room Brightness: " + livingRoomBrightness);
        System.out.println("Bedroom Color: " + bedroomColor);
    }
}
