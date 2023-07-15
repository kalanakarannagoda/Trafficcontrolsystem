
package Code;


public abstract class VehicleTraffic {
    
    private Pattern_Mediator mediator;
    private String VehicleName;

    public VehicleTraffic(Pattern_Mediator mediator, String VehicleName) {
        this.mediator = mediator;
        this.VehicleName = VehicleName;
    }

    public Pattern_Mediator getMediator() {
        return mediator;
    }

 
    public String getVeheName() {
        return VehicleName;
    }
    
    public abstract int ViewTrafficVeh(String lanes);
    
    
}
