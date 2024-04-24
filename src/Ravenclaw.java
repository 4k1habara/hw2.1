public class Ravenclaw extends Hogwarts {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int witchcraftPower, int transgression, int cleverness, int wisdom, int wit, int creation) {
        super(name, witchcraftPower, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", witchcraft power: "
                + getWitchcraftPower() + ", transgression: "
                + getTransgression() + ", faculty: Ravenclaw, cleverness: "
                + cleverness + ", wisdom: " + wisdom + ", wit: " + wit
                + ", creation: " + creation;
    }
    private int characterPointsS1;
    private int characterPointsS2;
    public String compareStudents(Ravenclaw student) {
        characterPointsS1 = this.cleverness + this.wisdom + this.wit + this.creation;
        characterPointsS2 = student.cleverness + student.wisdom + student.wit + student.creation;
        if (characterPointsS1 == characterPointsS2) {
            return "Students are equal";
        } else if (characterPointsS1 > characterPointsS2) {
            return this.getName() + " is better than " + student.getName();
        } else {
            return student.getName() + " is better than " + this.getName();
        }
    }
}
