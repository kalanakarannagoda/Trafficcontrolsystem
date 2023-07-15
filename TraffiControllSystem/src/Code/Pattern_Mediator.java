
package Code;

import java.util.List;

public interface Pattern_Mediator {
    
    public abstract int trafficLevel(Veh234 vehicle, String lanes);
    
    public abstract void addToLane1(Veh234 vehicles);
    public abstract void addToLane2(Veh234 vehicles);
    public abstract void addToLane3(Veh234 vehicles);
}
