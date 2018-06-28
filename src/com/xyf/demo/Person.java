package com.xyf.demo;

import java.util.List;

/**
 * Created by xyf on 2018/6/26.
 * 玩家
 */
public class Person {
    //id
    private  Integer ID;
    //姓名
    private  String userName;
    //手牌
    private List<String> list;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getList() {
        return list;
    }

    public Person(Integer ID, String userName, List<String> list) {
        this.ID = ID;
        this.userName = userName;
        this.list = list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


}
