package Villagers;

// Abstract base class for all types of villagers
// Defines shared properties and adds a performRole() function that each subclass will define on its own.

import java.util.Objects;

public abstract class Villager {
    protected String FirstName;
    protected String LastName;
    protected int Age;
    protected Boolean isActive;
    protected Profession profession; // to be set by subclass
    protected String AssignedBuilding; // set later by player
    protected String Residence; // set later by player

    // Constructor to initialize name, age and to be active by default
    public Villager(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        isActive = true;
    }

    // all getters

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public Boolean isActive() {
        return isActive;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getAssignedBuilding() {
        return Objects.requireNonNullElse(AssignedBuilding, "This villager has not been assigned a building yet.");
    }

    public String getResidence() {
        return Objects.requireNonNullElse(Residence, "This villager has not been assigned a residence yet.");
    }

    public String getFullName() {
        return FirstName + " " + LastName;
    }

    public String speak() {
        return "Hello, my name is " + getFullName() + ".";
    }

    // all setters

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    // behaviors or methods

    // TODO: Replace String with Building once the Building class is implemented
    public void assignToBuilding(String Building) {
        AssignedBuilding = Building;
    }

    // TODO: Replace String with House once the House class is implemented
    public void assignToHouse(String House) {
        Residence = House;
    }

    protected abstract void performRole(); // this will be defined by each subclass and will be called on each "tick" of the game turn
}
