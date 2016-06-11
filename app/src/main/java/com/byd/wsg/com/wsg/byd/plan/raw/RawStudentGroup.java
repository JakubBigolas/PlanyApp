package com.byd.wsg.com.wsg.byd.plan.raw;

/**
 * Created by Jakub on 2016-06-05.
 */
public class RawStudentGroup {

    Long id;

    String name;

    @Override
    public String toString() {
        return "RawStudentGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
