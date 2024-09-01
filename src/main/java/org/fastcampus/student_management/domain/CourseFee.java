package org.fastcampus.student_management.domain;

public class CourseFee {

    int fee;

    public CourseFee(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void changeFee(int fee) {
        if (fee < 0) {
            throw new IllegalArgumentException();
        }
        this.fee = fee;
    }

}
