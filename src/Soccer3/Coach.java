package Soccer3;

public class Coach {

    private int experience;

    public Coach(int experience) {
        this.experience = experience;
    }
// Eric war hier
    @Override
    public String toString() {
        return "Coach{" +
                "experience=" + experience +
                '}';
    }
}
