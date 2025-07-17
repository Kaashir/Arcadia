package Territories;

import Buildings.Building;

import java.util.ArrayList;
import java.util.List;

public abstract class Territory {
    protected String name;
    protected int maxBuildings;
    protected List<Building> buildings;
    protected int expansionCost; // Cost for a player to expand territory which increases maxBuildings.

    public Territory(String name) {
        this.name = name;
        maxBuildings = 5;
        expansionCost = 200;
        this.buildings = new ArrayList<>();
    }

    // getters

    public int getCurrentBuildings() {
        return buildings.size();
    }

    public int getRemainingBuildings() {
        return maxBuildings - buildings.size();
    }

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public int getExpansionCost() {
        return expansionCost;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    // helper methods

    // allows territories to expand costing expansionCost and have increased capacity
    public void expand(int additionalCapacity) {
        maxBuildings += additionalCapacity;
        // increases cost of expansion each time territories expand.
        expansionCost += 300;
    }

    public void addBuilding(Building building) {
        if (canAddBuilding(building) && !isFull()) {
            buildings.add(building);
            building.setTerritory(this);
        } else {
            if (isFull()) {
                System.out.println("Territory is full!");
            } else {
                System.out.println("Building type not allowed in this territory!");
            }
        }
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public boolean isFull() {
        return buildings.size() >= maxBuildings;
    }

    // abstract method that returns a list of classes that are a subclass of the Building abstract class.
    // the classes of buildings that are allowed are defined in the subclasses of territories.
    public abstract List<Class<? extends Building>> getAllowedBuildingTypes();

    public boolean canAddBuilding(Building building) {
        return getAllowedBuildingTypes().contains(building.getClass());
    };
}
