package com.selenity.ngta.entity.dataTransferObject;

import com.selenity.ngta.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;

    private String name;

    private String email;

    private Integer age;

    private Boolean active;


    /*
      @param User
      @desc Bu metod User objesini UserDto objesine çevirip yeni bir UserDTO döner.

     */
    public static UserDTO toUserDTO(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setAge(user.getAge());
        userDTO.setName(user.getUser_name());
        userDTO.setEmail(user.getUser_email());
        userDTO.setActive(user.getActive());

        return userDTO;
    }

}
