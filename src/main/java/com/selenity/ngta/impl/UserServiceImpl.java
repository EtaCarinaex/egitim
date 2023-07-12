package com.selenity.ngta.impl;

import com.selenity.ngta.entity.User;
import com.selenity.ngta.entity.dataTransferObject.UserDTO;
import com.selenity.ngta.repository.IUserRepository;
import com.selenity.ngta.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;


    public void deleteUser(Long userId) {
        if (!userRepository.existsById(userId))
            throw new IllegalArgumentException(userId + " -> User not found.");

        userRepository.deleteById(userId);
    }

    public UserDTO findOneUser(Long userId) {

        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty())
            throw new IllegalArgumentException(userId + " -> user not found");

        return UserDTO.toUserDTO(user.get());
    }

    public UserDTO updateUser(UserDTO userDTO) {

        Optional<User> dbUser = userRepository.findById(userDTO.getId());

        if (dbUser.isEmpty()) {
            throw new IllegalArgumentException(userDTO.getId() + " -> user not found");
        }

        User mappedUser = User.toUser(userDTO);

        return UserDTO.toUserDTO(userRepository.save(mappedUser));
    }


    public UserDTO createUser(UserDTO userDTO) {

        if (userDTO.getId() != null) {
            if (userRepository.existsById(userDTO.getId()))
                throw new IllegalStateException(userDTO.getId() + " -> id'li kayıt veritabanında var.");
        }

        User saveableUser = User.toUser(userDTO);

        return UserDTO.toUserDTO(userRepository.save(saveableUser));
    }

}
