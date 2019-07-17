package com.hengkun.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    @Id
    private int UserId;
    private int age;
    private String name;
    private String password;
    private String email;
    private String sex;

}
