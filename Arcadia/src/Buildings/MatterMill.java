package Buildings;

import Territories.Territory;
import Villagers.Profession;
import Villagers.Villager;

public class MatterMill extends Building{

    public MatterMill(String name, Territory territory) {
        super(name, territory);
        materialCost = 150;
        energyUpkeepPerTick = 20;
    }

    @Override
    public int operate() {
        int material = 0;
        // checks if the villager is an engineer and returns 5 material in that case per "tick" - for any other profession returns 1 material.
        for (Villager v : assignedVillagers) {
            if (v.getProfession() == Profession.ENGINEER) {
                material += 5;
            } else {
                material += 1;
            }
        }
        return material;
    }

}

