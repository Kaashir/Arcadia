package Territories;

import Buildings.*;
import java.util.ArrayList;
import java.util.List;

public class SunlayerQuarters extends Territory{

    public SunlayerQuarters(String name) {
        super(name);
    }

    // allows only AgriDome, SolarArray and House to be built on this Territory
    @Override
    public List<Class<? extends Building>> getAllowedBuildingTypes() {
        List<Class<? extends Building>> allowedBuildingTypes = new ArrayList<>();
        allowedBuildingTypes.add(AgriDome.class);
        allowedBuildingTypes.add(SolarArray.class);
        allowedBuildingTypes.add(House.class);
        return allowedBuildingTypes;
    }
}
