package com.misso.votingappbackend.model;

import java.util.Date;

public class Candidate {
    private String candidateId;
    private String submissionId;
    private String positionId;
    private Date createdOn;

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Candidate(String candidateId, String submissionId, String positionId, Date createdOn) {
        this.candidateId = candidateId;
        this.submissionId = submissionId;
        this.positionId = positionId;
        this.createdOn = createdOn;


    }
}
