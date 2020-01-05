package classes.maintask.datastudents;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class PersonBuilder {

    private Person person;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder setId(String id) {
        person.setId(Integer.parseInt(id));
        return this;
    }

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder setPatronymicName(String patronymicName) {
        person.setPatronymicName(patronymicName);
        return this;
    }

    public PersonBuilder setDateOfBirth(String dateOfBirth) {
        try {
            person.setBirthDate(formatDate.parse(dateOfBirth));
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder setTelephoneNumber (String telephoneNumber){
        person.setPhoneNumber(telephoneNumber);
        return this;
    }

    public PersonBuilder setFaculty(String faculty) {
        person.setFaculty(Faculty.getFacultyValueByRealName(faculty));
        return this;
    }

    public PersonBuilder setGroup (String group) {
        person.setGroup(Group.getGroupValueByRealName(group));
        return this;
    }

    public PersonBuilder setCourse(String course) {
        person.setCourse(Course.valueOf("C_" + course));
        return this;
    }

    public Person build (){
        return person;
    }
}
