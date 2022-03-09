package com.example.booklibrary.service;

import com.example.booklibrary.model.Users;
import com.example.booklibrary.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserService {
    @Autowired
    private UsersRepository userRepository;
    public List<Users> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(Users user) {
        userRepository.save(user);
    }

    public Users getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
