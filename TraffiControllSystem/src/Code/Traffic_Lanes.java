
package Code;

import java.util.ArrayList;
import java.util.List;

public class Traffic_Lanes implements Pattern_Mediator{
 
    private List<Veh234> Traffic_Lane1;
    private List<Veh234> Traffic_Lane2;
    private List<Veh234> Traffic_Lane3;
    List<Veh234> Lane;

    public Traffic_Lanes() {
        TrafficLane1 = new ArrayList<Veh234>();
        TrafficLane2 = new ArrayList<Veh234>();
        TrafficLane3 = new ArrayList<Veh234>();
    }

    
    public void addToTraffic_Lane1(Veh234 vehicles) {
    
        TrafficLane1.add(vehicles);
    }

    public void addToTraffic_Lane2(Veh234 vehicles) {
    
        TrafficLane2.add(vehicles);
    }

    public void addToTraffic_Lane3(Veh234 vehicles) {
    
        TrafficLane3.add(vehicles);
    }


    public int Traffic_Level(Veh234 vehicle, String lanes) {
    
        if (lanes == "Traffic Line 001") {
            Traffic_Lane = Traffic_Lane1;
        }else if(lanes == "Traffic Line 002"){
             Traffic_Lane = Traffic_Lane2;
        }else if(lanes == "Traffic Line 003"){
             Traffic_Lane = Traffic_Lane3;
        }
        
        int count = 0;
        for (Veh234 v : Traffic_Lane) {
            if (!v.getVehicleName().equalsIgnoreCase(vehicle.getVehicleName())) {
               count = count+1;
            }
        }
        return count;
    }

   
    public int trafficLevel(Veh234 vehicle, String lanes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addToLane1(Veh234 vehicles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void addToLane2(Veh234 vehicles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void addToLane3(Veh234 vehicles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}