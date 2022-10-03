package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.dto.UserDTO;
import com.sinaukoding.tokosinau.entity.mapping.UserMapping;
import com.sinaukoding.tokosinau.repository.UserRepository;
import com.sinaukoding.tokosinau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO findByUsername(String username) {
        return UserMapping.instance.toDto(repository.findByUsername(username));
    }
@Override
    public List<UserDTO> getAllData() {
        return UserMapping.instance.toListDto(repository.findAll());
    }

}
