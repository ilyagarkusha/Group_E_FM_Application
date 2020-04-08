package dao;

import entity.Job;

import java.util.List;

public interface JobDAO {

    Job getByCategory(String category);

    void addNewJob(Job job);

    void deleteJob(Job job);

    void updateJob(Job job);

    public List<Job> getAllPendingJobs();

    public List<Job> getAllAcceptedJobs();





}
