package classes.maintask.datastudents;

public enum  Faculty {
    ATF("АТФ"), MMF("ММФ"),
    ;
    private String facultyRealName;

    Faculty(String faculty) {
        this.facultyRealName = faculty;
    }
    public String getFacultyRealName() {
        return this.facultyRealName;
    }

    public static   Faculty getFacultyValueByRealName(String code) {
        for (Faculty faculty : Faculty.values()) {
            if (faculty.facultyRealName.equals(code)) {
                return faculty;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return getFacultyRealName();
    }


}