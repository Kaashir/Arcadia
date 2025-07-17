package Buildings;

import Villagers.Profession;
import Villagers.Villager;

public class SolarArray extends Building {

    public SolarArray(String name, String territory) {
        super(name, territory);
        materialCost = 100;
        energyUpkeepPerTick = 5;
    }

    @Override
    public int operate() {
        int energy = 0;
        // checks if the villager is an engineer and returns 5 energy in that case per "tick" - for any other profession returns 1 energy.
        for (Villager v : assignedVillagers) {
            if (v.getProfession() == Profession.ENGINEER) {
                energy += 5;
            } else {
                energy+= 1;
            }
        }
        return energy;
    }

}

