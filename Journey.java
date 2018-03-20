package domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Journey implements IJourney{
    
    @Id
    private long id;
    private List<ITransLocation> transLocations;
    
    public Journey(){
        
    }

    @Override
    public List<ITransLocation> getTransLocations() {
        return this.transLocations;
    }

}
