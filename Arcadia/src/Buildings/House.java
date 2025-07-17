package Buildings;

import Villagers.Villager;

import java.util.List;

public class House extends Building{

    //TODO: Change to Territory territory once Territory class is defined.
    //Uses inherited capacity and villager assignment logic from Building.
    public House(String name, String territory) {
        super(name, territory);
        materialCost = 50;
        energyUpkeepPerTick = 3;
    }

    // empty for now since it only houses villagers - but this can have future features such as influencing harmony
    @Override
    public int operate() {
        return 0;
    }

}
