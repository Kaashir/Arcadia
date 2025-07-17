package Buildings;

import Villagers.Profession;
import Villagers.Villager;

public class AgriDome extends Building{

    public AgriDome(String name, String territory) {
        super(name, territory);
        materialCost = 75;
        energyUpkeepPerTick = 15;
    }

    @Override
    public int operate() {
        int food = 0;
        // checks if the villager is a farmer and returns 5 food in that case per "tick" - for any other profession returns 1 food.
        for (Villager v : assignedVillagers) {
            if (v.getProfession() == Profession.FARMER) {
                food += 5;
            } else {
                food += 1;
            }
        }
        return food;
    }

}
