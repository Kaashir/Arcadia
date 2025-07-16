package Villagers;

public class Farmer extends Villager {

    public Farmer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        // assigning profession as Farmer using the Enum.
        this.profession = Profession.FARMER;
    }

    // Generates +5 resource every "tick" if assigned to a farm, otherwise only generates +1 resource for any other building.
    // The building determines the resource being generated.
    @Override
    protected void performRole() {
        if (getAssignedBuilding() != null ) { // TODO: replace with getAssignedBuilding instanceof() Farm
            // TODO: ResourceManager.addResource(5)
        } else {
            // TODO: ResourceManager.addResource(1)
        }
    }
}
`