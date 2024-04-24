public class Hogwarts {
    private String name;
    private int witchcraftPower;
    private int transgression;

    public Hogwarts(String name, int witchcraftPower, int transgression) {
        this.name = name;
        this.witchcraftPower = witchcraftPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    private int characterPointsS1;
    private int characterPointsS2;
    public String compareStudents(Hogwarts student) {
        characterPointsS1 = this.witchcraftPower + this.transgression;
        characterPointsS2 = student.witchcraftPower + student.transgression;
        if (characterPointsS1 == characterPointsS2) {
            return "Students are equal";
        } else if (characterPointsS1 > characterPointsS2) {
            return this.getName() + " is better than " + student.getName();
        } else {
            return student.getName() + " is better than " + this.getName();
        }
    }
}
