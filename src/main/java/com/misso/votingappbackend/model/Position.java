package com.misso.votingappbackend.model;

public class Position {
    private String positionId;
    private String title;
    private String team;
    private String rank;
    private String icon;
    private String promptUrl;

    public Position(String positionId, String title, String team, String rank, String icon, String promptUrl) {
        this.positionId = positionId;
        this.title = title;
        this.team = team;
        this.rank = rank;
        this.icon = icon;
        this.promptUrl = promptUrl;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPromptUrl() {
        return promptUrl;
    }

    public void setPromptUrl(String promptUrl) {
        this.promptUrl = promptUrl;
    }
}
