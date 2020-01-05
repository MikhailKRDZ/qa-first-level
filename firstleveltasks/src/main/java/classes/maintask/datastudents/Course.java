package classes.maintask.datastudents;

public enum  Course {
    C_3(3),
    C_4(4),
    ;
    private int course;

    Course(int course) {
        this.course = course;
    }
    public int getCourseRealName() {
        return this.course;
    }
    @Override
    public String toString() {
        return String.valueOf(getCourseRealName());
    }
}
