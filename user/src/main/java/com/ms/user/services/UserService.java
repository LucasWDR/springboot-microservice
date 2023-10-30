package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }

    public List<UserModel> getAllUsers(){
        List<UserModel> users = userRepository.findAll();

        return users;
    }
}
