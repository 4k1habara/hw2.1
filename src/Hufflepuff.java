public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraftPower, int transgression, int hardworking, int loyalty, int honesty) {
        super(name, witchcraftPower, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", witchcraft power: "
                + getWitchcraftPower() + ", transgression: "
                + getTransgression() + ", faculty: Hufflepuff, hardworking: " + hardworking
                + ", loyalty: " + loyalty + ", honesty: " + honesty;
    }

    private int characterPointsS1;
    private int characterPointsS2;
    public String compareStudents(Hufflepuff student) {
        characterPointsS1 = this.hardworking + this.loyalty + this.honesty;
        characterPointsS2 = student.hardworking + student.loyalty + student.honesty;
        if (characterPointsS1 == characterPointsS2) {
            return "Students are equal";
        } else if (characterPointsS1 > characterPointsS2) {
            return this.getName() + " is better than " + student.getName();
        } else {
            return student.getName() + " is better than " + this.getName();
        }
    }
}
