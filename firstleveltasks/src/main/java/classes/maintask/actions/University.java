package classes.maintask.actions;

import classes.maintask.output.Printer;
import classes.maintask.datastudents.Faculty;
import classes.maintask.datastudents.Group;
import classes.maintask.datastudents.Student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import static classes.maintask.actions.UniversityCriterion.*;

public class University implements IUniversity {
    private Student[] students;

    public University(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public Student[] getStudents() {
        return students;
    }

    public void showListStudentsFaculty(Faculty faculty) {
        ArrayList<Student> listStudentsRequiredFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                listStudentsRequiredFaculty.add(student);
            }
        }
        listStudentsRequiredFaculty.sort(new UniversityComparator(    BY_SURNAME, BY_NAME, BY_PATRONYMIC_NAME));
         prepareForPrinter(listStudentsRequiredFaculty, "Список студентов- Факультет:" + faculty.getFacultyRealName());
    }

    public void showListStudentsAllFacultyAllCourses() {
        ArrayList<Student> listStudents = new ArrayList<>();
        Collections.addAll(listStudents, students);
        listStudents.sort(new UniversityComparator(BY_FACULTY, BY_COURSE, BY_GROUP, BY_SURNAME, BY_NAME, BY_PATRONYMIC_NAME));
         prepareForPrinter(listStudents, "Список студентов всех фвкультетов и курсов,По факультетам и курсам");
    }

    public void showListStudentsBornAfter(Date date) {
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        ArrayList<Student> listStudentsBornAfter = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthDate().compareTo(date) >= 0) {
                listStudentsBornAfter.add(student);
            }
        }
        listStudentsBornAfter.sort(new UniversityComparator(BY_BIRTH_DATE, BY_SURNAME, BY_NAME, BY_PATRONYMIC_NAME));

        prepareForPrinter(listStudentsBornAfter, "Список студентов родившихся после года: " + formatYear.format(date));
    }

    public void showListStudentsGroup(Group group) {
        ArrayList<Student> listStudentsRequiredGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                listStudentsRequiredGroup.add(student);
            }
        }
        listStudentsRequiredGroup.sort(new UniversityComparator(BY_SURNAME, BY_NAME, BY_PATRONYMIC_NAME));
        prepareForPrinter(listStudentsRequiredGroup, "Список студентов Группы: " + group.getGroupRealName());
    }

    private void prepareForPrinter(ArrayList<Student> students, String listsName) {
        ArrayList<String> studentsRequired = new ArrayList<>();
        studentsRequired.add(listsName);
        studentsRequired.add(students.get(0).getHeadlines());
        for (Student student : students) {
            studentsRequired.add(student.toString());
        }
        Printer.printStudents(studentsRequired);
    }


    @Override
    public void addStudent(Student student) {
        if (student.getGroup().isInGroup(student.getCourse(), student.getFaculty())) {
            if (UniversityChecker.checkLength(this.students)) {
                int position = UniversityChecker.getPosition(this.students);
                this.students[position] = student;
            } else {
                System.out.println("Error entering array size");
            }
        } else {
            System.out.println("input error Group( Course, Faculty)" + student.toString());
        }
    }
}