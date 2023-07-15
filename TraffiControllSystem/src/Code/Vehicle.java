
package Code;


public class Vehicle extends Veh234{

    private Pattern_Mediator mediator;
    private String VehicleName;
    
    public Vehicle(Pattern_Mediator mediator, String VehicleName) {
        super(mediator, VehicleName);
        this.VehicleName = VehicleName;
        this.mediator = mediator;
    }

    public Vehicle(Pattern_Mediator mediator, String efg123) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    @Override
    public int viewTraffic(String lanes) {
    
        return mediator.trafficLevel(this, lanes);
       
    }
    
}
