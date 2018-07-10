package com.example.SqsxUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class SqsxUser implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;
    private int password;
    private Integer type;
    private Integer isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public SqsxUser() {
    }


    @Override
    public String toString() {
        return "SqsxUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=" + password +
                ", type=" + type +
                ", isdel=" + isdel +
                '}';
    }
}
