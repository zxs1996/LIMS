package com.example.lims.POJO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.Date;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC,force = true)
@RequiredArgsConstructor
//@Entity
public class User
{
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "loginstate")
    private boolean loginstate;
    @Column(name = "createtime")
    @JsonFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    private Date  createtime;


    @PrePersist
    public void CreateTime()
    {
        this.createtime=new Date();
    }

}
