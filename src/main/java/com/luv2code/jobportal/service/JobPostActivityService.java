package com.luv2code.jobportal.service;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.entity.RecruiterJobsDto;

import java.time.LocalDate;
import java.util.List;

public interface JobPostActivityService {

    public JobPostActivity addNew(JobPostActivity jobPostActivity);

    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter);

    public JobPostActivity getOne(int id);

    List<JobPostActivity> getAll();

    List<JobPostActivity> search(String job, String location, List<String> list, List<String> list1, LocalDate searchDate);
}