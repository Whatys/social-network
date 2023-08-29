package org.socialnetwork.service;

import org.socialnetwork.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Long saveUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);


}
