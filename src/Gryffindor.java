import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int witchcraftPower, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraftPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", witchcraft power: "
                + getWitchcraftPower() + ", transgression: "
                + getTransgression() + ", faculty: Gryffindor, nobility: " + nobility
                + ", honor: " + honor + ", bravery: " + bravery;
    }
    private int characterPointsS1;
    private int characterPointsS2;
    public String compareStudents(Gryffindor student) {
        characterPointsS1 = this.nobility + this.honor + this.bravery;
        characterPointsS2 = student.nobility + student.honor + student.bravery;
        if (characterPointsS1 == characterPointsS2) {
            return "Students are equal";
        } else if (characterPointsS1 > characterPointsS2) {
            return this.getName() + " is better than " + student.getName();
        } else {
            return student.getName() + " is better than " + this.getName();
        }
    }
}
