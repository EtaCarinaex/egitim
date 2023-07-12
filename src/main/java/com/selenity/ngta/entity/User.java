package com.selenity.ngta.entity;

import com.selenity.ngta.entity.dataTransferObject.UserDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name= "user_email")
    private String user_email;

    @Column(name = "age")
    private Integer age;

    @Column(name = "active")
    private Boolean active;


    public static User toUser(UserDTO userDTO){

        User user = new User();
        user.setId(userDTO.getId());
        user.setUser_name(userDTO.getName());
        user.setActive(userDTO.getActive());
        user.setAge(userDTO.getAge());
        user.setUser_email(userDTO.getEmail());

        return user;
    }

}
