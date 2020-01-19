package com.gmail.aperavoznikau.service;

import java.util.List;

import com.gmail.aperavoznikau.service.model.AddUserDTO;
import com.gmail.aperavoznikau.service.model.UserDTO;

public interface UserService {

    void add(List<AddUserDTO> users);

    List<UserDTO> findAll();

    int deleteUserWhereAgeLessThanParameter(int age);

    void disableUsersByAge(int minAge, int maxAge);

}
