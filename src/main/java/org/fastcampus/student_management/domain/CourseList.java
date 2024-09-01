package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    private final List<Course> courses;

    public CourseList(List<Course> courses) {
        this.courses = courses;
    }

    public void changeCoursesFee(int fee) {
        for (Course course : this.courses) {
            if (course.isWeek()) {
                course.changeFee((int) (fee * 1.5));
                continue;
            }
            course.changeFee(fee);
        }
    }

}
