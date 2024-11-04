package com.luv2code.jobportal.service;

import com.luv2code.jobportal.entity.Users;

import java.util.Optional;

public interface UsersService {

    public Users addNew(Users users);

    public Optional<Users> getUserByEmail(String email);

    public Object getCurrentUserProfile();

    public Users getCurrentUser();


    public Users findByEmail(String currentUsername) ;

}
