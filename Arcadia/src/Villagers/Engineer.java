package Villagers;

public class Engineer extends Villager {

    public Engineer (String FirstName, String LastName, int Age) {
        super(FirstName, LastName, Age);
        // assigning profession as Farmer using the Enum.
        this.profession = Profession.ENGINEER;
    }

    // Generates +5 resource every "tick" if assigned to a Solar Array, otherwise only generates +1 resource for any other building.
    // The building determines the resource being generated.
    @Override
    public void performRole() {
        if (getAssignedBuilding() != null) {
            if (getAssignedBuilding() == "Solar Array") {// TODO: replace with getAssignedBuilding instanceof() SolarArray
                // TODO: assignedBuilding.addResource(5)
            } else {
                // TODO: ResourceManager.addResource(1)
            }
        }
    }
}

