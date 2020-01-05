package classes.maintask.actions;

import classes.maintask.datastudents.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class UniversityComparator implements Comparator<Student> {

    private List<Comparator<Student>> simpleComparators;

    @SafeVarargs
    UniversityComparator(Comparator<Student>... simpleComparators) {
        this.simpleComparators = Arrays.asList(simpleComparators);
    }

    public int compare(Student o1, Student o2) {
        for (Comparator<Student> comparator : simpleComparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
