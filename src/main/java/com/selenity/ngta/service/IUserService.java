package com.selenity.ngta.service;

import com.selenity.ngta.entity.dataTransferObject.UserDTO;

public interface IUserService {

    void deleteUser(Long userId);

    UserDTO findOneUser(Long userId);

    UserDTO updateUser(UserDTO userDTO);

    UserDTO createUser(UserDTO userDTO);

}
