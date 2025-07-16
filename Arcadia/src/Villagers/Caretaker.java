package Villagers;

public class Caretaker extends Villager {

    public Caretaker(String FirstName, String LastName, int Age) {
        super(FirstName, LastName, Age);
        // assigning profession as Farmer using the Enum.
        this.profession = Profession.CARETAKER;
    }

    // Generates +5 resource every "tick" if assigned to a Community Grove, otherwise only generates +1 resource for any other building.
    // The building determines the resource being generated.
    @Override
    public void performRole() {
        if (getAssignedBuilding() != null) {
            if (getAssignedBuilding() == "Community Grove") {// TODO: replace with getAssignedBuilding instanceof() CommunityGrove
                // TODO: assignedBuilding.addResource(5)
            } else {
                // TODO: ResourceManager.addResource(1)
            }
        }
    }
}
