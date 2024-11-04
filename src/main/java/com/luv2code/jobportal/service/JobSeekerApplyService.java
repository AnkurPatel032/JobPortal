package com.luv2code.jobportal.service;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.entity.JobSeekerApply;
import com.luv2code.jobportal.entity.JobSeekerProfile;

import java.util.List;

public interface JobSeekerApplyService {

    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId);

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job);

    public void addNew(JobSeekerApply jobSeekerApply);

}
