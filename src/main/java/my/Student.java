package my;

public class Student extends Person implements Learner{
    private double totalStudyTime;


    public Student(long id) {
        super(id);
    }

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
