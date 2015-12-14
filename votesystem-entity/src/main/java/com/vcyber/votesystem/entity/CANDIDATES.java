package com.vcyber.votesystem.entity;

public class CANDIDATES {
    private Integer id;

    private Integer userId;

    private Integer voteId;

    private Integer ballots;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getBallots() {
        return ballots;
    }

    public void setBallots(Integer ballots) {
        this.ballots = ballots;
    }
}