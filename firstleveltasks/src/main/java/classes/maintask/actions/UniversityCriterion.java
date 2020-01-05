package classes.maintask.actions;


import classes.maintask.datastudents.Student;

import java.util.Comparator;

public enum UniversityCriterion implements Comparator<Student> {
    BY_NAME {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    },
    BY_SURNAME {
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    },
    BY_PATRONYMIC_NAME {
        public int compare(Student o1, Student o2) {
            return o1.getPatronymicName().compareTo(o2.getPatronymicName());
        }
    },
    BY_BIRTH_DATE {
        public int compare(Student o1, Student o2) {
            return o1.getBirthDate().compareTo(o2.getBirthDate());
        }
    },
    BY_FACULTY {
        public int compare(Student o1, Student o2) {
            return o1.getFaculty().compareTo(o2.getFaculty());
        }
    },
    BY_COURSE {
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }
    },
    BY_GROUP {
        public int compare(Student o1, Student o2) {
            return o1.getGroup().compareTo(o2.getGroup());
        }
    },
}