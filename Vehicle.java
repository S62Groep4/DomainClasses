package domain;

import java.util.Collections;
import java.util.List;


public class Vehicle implements IVehicle{
    
    private String hashedLicensePlate;
    private List<IJourney> journeys;
    private List<ISubInvoice> subInvoices;
    
    public Vehicle(){
        
    }

    @Override
    public String getHashedLicensePlate() {
        return this.hashedLicensePlate;
    }

    @Override
    public List<IJourney> getJourneys() {
        return Collections.unmodifiableList(journeys);
    }

    @Override
    public List<ISubInvoice> getSubInvoices() {
        return Collections.unmodifiableList(subInvoices);
    }

}
