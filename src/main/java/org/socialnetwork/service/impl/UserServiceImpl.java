package org.socialnetwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.socialnetwork.models.User;
import org.socialnetwork.repository.UserRepository;
import org.socialnetwork.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Long saveUser(User user){
        return userRepository.save(user).getUserId();
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public  List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @Override
    public Optional<User> getUserById(Long id){
        return  userRepository.findById(id);
    }
}
