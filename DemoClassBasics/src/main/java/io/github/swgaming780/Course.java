package io.github.swgaming780;

public class Course {
    private final int creditHours;
    private final int courseNum;
    private final String departmentCode;
    private final String description;
    private final String title;

    public Course(
            int creditHours,
            int courseNum,
            String departmentCode,
            String title,
            String description
    ) {
        this.creditHours = creditHours;
        this.courseNum = courseNum;
        this.departmentCode = departmentCode;
        this.title = title;
        this.description = description;
    }

    public int getCreditHours() {

        return  this.creditHours;

//    public void  setCreditHours(int creditHours) {
//        this.creditHours = creditHours;
    }

    public int getCourseNum() {
        return this.courseNum;
    }

    public String getDepartmentCode() {
        return this.departmentCode;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public static void sayHello() {
        System.out.println("HelLo");
    }

    public String toString() {
        String courseInfo = "Course Information:";
        courseInfo += "\nCredit Hours: " + this.creditHours;
        courseInfo += "\nCourse Title: " + this.title;
        courseInfo += "\nCourse Description: " + this.description;
        return courseInfo;
    }
}
