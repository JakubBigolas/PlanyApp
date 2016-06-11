package com.byd.wsg.com.wsg.byd.plan.raw;

/**
 * Created by Jakub on 2016-06-05.
 */
public class RawTeacher {

    Long id;
    RawUser user;

    public Long getId() {
        return id;
    }

    public RawUser getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "RawTeacher{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
