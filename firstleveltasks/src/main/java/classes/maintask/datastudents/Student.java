package classes.maintask.datastudents;

import java.util.Date;

public abstract class Student {
    Faculty faculty;
    Course course;
    Group group;


    Student(Faculty faculty,
            Course course,
            Group group) {

        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    Student() {
        super();
    }


    public Faculty getFaculty() {
        return faculty;
    }

    public Course getCourse() {
        return course;
    }

    public Group getGroup() {
        return group;
    }

    public abstract String getSurname();

    public abstract String getName();

    public abstract String getPatronymicName();

    public abstract Date getBirthDate();

    public abstract String getHeadlines();
}

