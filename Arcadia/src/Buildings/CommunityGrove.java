package Buildings;

import Territories.Territory;
import Villagers.Profession;
import Villagers.Villager;

public class CommunityGrove extends Building{

    public CommunityGrove(String name, Territory territory) {
        super(name, territory);
        materialCost = 200;
        energyUpkeepPerTick = 10;
    }

    @Override
    public int operate() {
        int harmony = 0;
        // checks if the villager is a caretaker and returns 5 harmony in that case per "tick" - for any other profession returns 1 harmony.
        for (Villager v : assignedVillagers) {
            if (v.getProfession() == Profession.CARETAKER) {
                harmony += 5;
            } else {
                harmony += 1;
            }
        }
        return harmony;
    }
}

