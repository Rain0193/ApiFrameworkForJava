package com.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String userName;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    @Override
    public String toString(){
        return(
                "{id:" + id + "," +
                "userName:" + userName + "," +
                "age:" + age + "," +
                "sex:" + sex + "," +
                "permission:" + permission + "," +
                "isDelete:" + isDelete + "}"
                );
    }
}
