package classes.maintask.datastudents;

public enum Group {

    G_625("625", Course.C_4, Faculty.ATF),
    G_626("626", Course.C_3, Faculty.ATF),
    G_126("126", Course.C_4, Faculty.MMF),
    ;

    private String groupRealName;
    private Course course;
    private Faculty faculty;


    Group(String groupRealName, Course course, Faculty faculty) {
        this.groupRealName = groupRealName;
        this.course = course;
        this.faculty = faculty;
    }

    public static Group getGroupValueByRealName(String code) {
        for (Group group : Group.values()) {
            if (group.groupRealName.equals(code)) {
                return group;
            }
        }
        return null;
    }

    public String getGroupRealName() {
        return  this.groupRealName;
    }

    public boolean isInGroup(Course course, Faculty faculty) {
        return (this.course == course && this.faculty == faculty);
    }


    @Override
    public String toString() {
        return groupRealName;
    }
}
