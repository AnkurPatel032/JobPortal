package com.luv2code.jobportal.service;

import com.luv2code.jobportal.entity.JobPostActivity;
import com.luv2code.jobportal.entity.JobSeekerApply;
import com.luv2code.jobportal.entity.JobSeekerProfile;
import com.luv2code.jobportal.entity.JobSeekerSave;

import java.util.List;

public interface JobSeekerSaveService {

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId);

    public List<JobSeekerSave> getJobCandidates(JobPostActivity job);

    public void addNew(JobSeekerSave jobSeekerSave);
}
