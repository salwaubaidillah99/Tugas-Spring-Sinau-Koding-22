package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.User;
import com.sinaukoding.tokosinau.entity.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO findByUsername(String username);

    List<UserDTO> getAllData();
}
