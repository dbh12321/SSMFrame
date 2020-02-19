package com.dbh123.domain;

import java.util.Date;

public class GameRole {
    private int id;
    private String name;
    private int level;
    private Date createDate;
    private  User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", createDate=" + createDate +
                ", user=" + user +
                '}';
    }
}
