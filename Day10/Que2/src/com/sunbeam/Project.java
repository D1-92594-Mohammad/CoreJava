package com.sunbeam;

public class Project {
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;

    public Project(int id, String title, int teamSize, double projectCost, String technology){
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId(){
        return id;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public double getProjectCost(){
        return projectCost;
    }

    @Override
    public String toString(){
        return "Project{id=" + id + ", title=" + title + ", teamSize=" + teamSize +
               ", cost=" + projectCost + ", tech=" + technology + "}";
    }

    // Ensure uniqueness by id
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Project p = (Project)o;
        return this.id == p.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
}
