package com.byd.wsg.com.wsg.byd.plan.raw;

/**
 * Created by Jakub on 2016-06-05.
 */
public class RawStudent {

    Long id;

    RawStudentGroup studentGroup;

    RawUser user;

    @Override
    public String toString() {
        return "RawStudent{" +
                "id=" + id +
                ", studentGroup=" + studentGroup +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RawStudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(RawStudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public RawUser getUser() {
        return user;
    }

    public void setUser(RawUser user) {
        this.user = user;
    }
}
