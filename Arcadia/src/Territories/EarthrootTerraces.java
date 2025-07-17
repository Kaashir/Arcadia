package Territories;

import Buildings.*;

import java.util.ArrayList;
import java.util.List;

public class EarthrootTerraces extends Territory{

    public EarthrootTerraces(String name) {
        super(name);
    }

    // allows only MatterMill, CommunityGrove and House to be built on this territory
    @Override
    public List<Class<? extends Building>> getAllowedBuildingTypes() {
        List<Class<? extends Building>> allowedBuildingTypes = new ArrayList<>();
        allowedBuildingTypes.add(MatterMill.class);
        allowedBuildingTypes.add(CommunityGrove.class);
        allowedBuildingTypes.add(House.class);
        return allowedBuildingTypes;
    };
}
