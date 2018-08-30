package com.example.domain;/*
 * @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

public class Reader {
    private String name;
    private String sex;
    private Integer age;
    private String address;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
