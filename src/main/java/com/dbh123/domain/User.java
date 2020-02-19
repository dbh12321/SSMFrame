package com.dbh123.domain;

import java.util.List;

public class User {
    private int id;
    private String userName;
    private String passWord;
    private List<GameRole> gameRoleList ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<GameRole> getGameRoleList() {
        return gameRoleList;
    }

    public void setGameRoleList(List<GameRole> gameRoleList) {
        this.gameRoleList = gameRoleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", gameRoleList=" + gameRoleList +
                '}';
    }
}
