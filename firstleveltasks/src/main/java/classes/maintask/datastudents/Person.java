package classes.maintask.datastudents;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person extends Student {
    private int id;
    private String surname;
    private String name;
    private String patronymicName;
    private Date birthDate;
    private String address;
    private String phoneNumber;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");


    public Person(int id, String surname, String name, String patronymicName, Date birthDate, String address, String telephoneNumber, Faculty faculty, Course course, Group group) {
        super(faculty, course, group);
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = telephoneNumber;


    }

    Person() {

    }

    public Person(Person person) {
        super(person.faculty, person.course, person.group);
        this.id = person.id;
        this.surname = person.surname;
        this.name = person.name;
        this.patronymicName = person.patronymicName;
        this.birthDate = person.birthDate;
        this.address = person.address;
        this.phoneNumber = person.phoneNumber;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setBirthDate(Date birthDate) {
            this.birthDate =birthDate;
    }

    void setFaculty(Faculty faculty) {
        super.faculty = faculty;
    }

    void setCourse(Course course) {
        super.course = course;
    }

    void setGroup(Group group) {
        super.group = Group.valueOf("G_" + group);

    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHeadlines() {
        return "id" + "\t" + "Фамилия" + "\t" + "Имя" + "\t" + "Отчество" + "\t" + "Дата рождения" + "\t" + "Адрес" + "\t" + "Телефон" + "\t" + "Факультет" + "\t" + "Курс" + "\t" + "Группа" + "\t\n";
    }

    @Override
    public String toString() {
        return id + "\t" + surname + "\t" + name + "\t" + patronymicName + "\t" + formatDate.format(birthDate) + "\t" + address + "\t" + phoneNumber + "\t" + faculty + "\t" + course + "\t" + group + "\t\n";
    }
}