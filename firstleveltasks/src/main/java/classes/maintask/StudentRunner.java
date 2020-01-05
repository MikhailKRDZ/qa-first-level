package classes.maintask;

import classes.maintask.output.Printer;
import classes.maintask.datastudents.*;
import classes.maintask.actions.University;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class StudentRunner {
    public static void main(String[] args) {

        final int REQUIRED_STUDENTS_NUMBERS = 10;

        University university = new University(REQUIRED_STUDENTS_NUMBERS);
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        ArrayString arrayString = new ArrayString();
        String[][] arrayStringPersons = arrayString.getArrayString();

        for (String[] string:arrayStringPersons) {
            try {
                PersonBuilder builder = new PersonBuilder();
                Person personBuilder = builder.setId(string[0])
                        .setSurname(string[1])
                        .setName(string[2])
                        .setPatronymicName(string[3])
                        .setDateOfBirth(string[4])
                        .setAddress(string[5])
                        .setTelephoneNumber(string[6])
                        .setFaculty(string[7])
                        .setCourse(string[8])
                        .setGroup(string[9])
                        .build();
                Student student = new Person(personBuilder);
                university.addStudent(student);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        try {
            final Faculty REQUIRED_FACULTY = Faculty.getFacultyValueByRealName("АТФ");
            final Group REQUIRED_GROUP = Group.getGroupValueByRealName("625");
            final Date REQUIRED_DATE = formatYear.parse("2001");

            Printer.printStudents(university.getStudents());

            university.showListStudentsFaculty(REQUIRED_FACULTY);
            university.showListStudentsAllFacultyAllCourses();
            university.showListStudentsBornAfter(REQUIRED_DATE);
            university.showListStudentsGroup(REQUIRED_GROUP);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}