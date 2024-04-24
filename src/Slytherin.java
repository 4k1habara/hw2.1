public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public Slytherin(String name, int witchcraftPower, int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int powerLust) {
        super(name, witchcraftPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", witchcraft power: "
                + getWitchcraftPower() + ", transgression: "
                + getTransgression() + ", faculty: Slytherin, cunning: "
                + cunning + ", determination: " + determination + ", ambition: " + ambition
                + ", resourcefulness: " + resourcefulness + ", power lust: " + powerLust;
    }
    private int characterPointsS1;
    private int characterPointsS2;
    public String compareStudents(Slytherin student) {
        characterPointsS1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.powerLust;
        characterPointsS2 = student.cunning + student.determination + student.ambition + student.resourcefulness + student.powerLust;
        if (characterPointsS1 == characterPointsS2) {
            return "Students are equal";
        } else if (characterPointsS1 > characterPointsS2) {
            return this.getName() + " is better than " + student.getName();
        } else {
            return student.getName() + " is better than " + this.getName();
        }
    }
}
