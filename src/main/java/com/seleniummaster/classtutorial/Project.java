package com.seleniummaster.classtutorial;

public class Project {
   private int projectId;
  private String  ProjectName;
    private  String ProjectOwner;
    private String ProjectType;
    private boolean isActive;

//this is a constructor without argument(defaul constractor)
    public Project() {
    }
//this is a constractor with arguments
    public Project(int projectId, String projectName, String projectOwner) {
        this.projectId = projectId;
        ProjectName = projectName;
        ProjectOwner = projectOwner;
    }

    public Project(int projectId, String projectName, String projectOwner, String projectType, boolean isActive) {
        this.projectId = projectId;
        ProjectName = projectName;
        ProjectOwner = projectOwner;
        ProjectType = projectType;
        this.isActive = isActive;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getProjectOwner() {
        return ProjectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        ProjectOwner = projectOwner;
    }

    public String getProjectType() {
        return ProjectType;
    }

    public void setProjectType(String projectType) {
        ProjectType = projectType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
