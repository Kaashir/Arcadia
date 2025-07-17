package Buildings;

// base abstract parent class that all subclasses of buildings will inherit from.

import Territories.Territory;
import Villagers.Villager;

import java.util.ArrayList;
import java.util.List;

public abstract class Building {
    protected String name;
    protected Territory territory; //TODO: Change to Territory territory once Territory class is defined
    protected int maxCapacity;
    protected int currentCapacity;
    protected List<Villager> assignedVillagers;
    protected int materialCost;
    protected int energyUpkeepPerTick;

    // default constructor - materialCost and energyUpkeepPerTick to be defined by subclasses
    // TODO: Change String Territory to Territory territory once Territory class is defined
    public Building(String name, Territory territory) {
        this.name = name;
        this.territory = territory;
        maxCapacity = 5;
        currentCapacity = 0;
        assignedVillagers = new ArrayList<>();
    }

    // getters

    public String getName() {
        return name;
    }

    public Territory getTerritory() {
        return territory;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public List<Villager> getAssignedVillagers() {
        return assignedVillagers;
    }

    public int getMaterialCost() {
        return materialCost;
    }

    public int getEnergyUpkeepPerTick() {
        return energyUpkeepPerTick;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    // helper methods
    public void assignVillager(Villager villager) {
        assignedVillagers.add(villager);
    }

    public void removeVillager(Villager villager) {
        assignedVillagers.remove(villager);
    }

    public boolean isFull() {
        return currentCapacity >= maxCapacity;
    }

    public boolean isEmpty() {
        return currentCapacity <= 0;
    }

    public int getCurrentVillagerCount() {
        return assignedVillagers.size();
    }

    // abstract method for subclasses to be able to produce resources
    public abstract int operate();

}
