package com.luv2code.jobportal.service;

import com.luv2code.jobportal.entity.RecruiterProfile;

import java.util.Optional;

public interface RecruiterProfileService {


    public Optional<RecruiterProfile> getOne(Integer id);

    RecruiterProfile addNew(RecruiterProfile recruiterProfile);

    RecruiterProfile getCurrentRecruiterProfile();
}
