package com.example.domain;

import org.springframework.beans.factory.annotation.Value;

/** @Author
 * @Date：Created in ${time} ${date}
 * @description
 * @Modified By
 * */

public class Reader {
    @Value("")
    private String name;
    @Value("")
    private String sex;
    @Value("")
    private Integer age;
    @Value("")
    private String address;

    public Integer getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
