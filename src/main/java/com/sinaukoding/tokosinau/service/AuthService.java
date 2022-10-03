package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.dto.AuthenticationDTO;
import com.sinaukoding.tokosinau.entity.dto.ResponseAuthDTO;
import com.sinaukoding.tokosinau.entity.dto.UserDTO;

public interface AuthService {
    ResponseAuthDTO register(UserDTO data);

    ResponseAuthDTO login(AuthenticationDTO data);
}
