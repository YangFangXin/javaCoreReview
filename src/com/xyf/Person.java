package com.xyf;

import java.util.List;

/**
 * Created by bianlifeng on 2018/6/26.
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

    public void setList(List<String> list) {
        this.list = list;
    }
}
