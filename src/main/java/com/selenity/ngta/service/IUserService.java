package com.selenity.ngta.service;

import com.selenity.ngta.entity.dataTransferObject.UserDTO;

public interface IUserService {

    public void deleteUser(Long userId);

    public UserDTO findOneUser(Long userId);

    public UserDTO updateUser(UserDTO userDTO);

    public UserDTO createUser(UserDTO userDTO);

}
