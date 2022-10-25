/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author duytr
 */
public class Task {

    public static String DISPLAY_FORMAT_HEADER = "%-5s|%-10s|%-20s|%-15s|%-10s|%-20s|%-20s\n";
    public static String DISPLAY_HEADER
            = String.format(DISPLAY_FORMAT_HEADER, "ID", "Task type", "Name", "Date", "Time", "Asignee", "Reviewer");
    private int id;
    private String taskType;
    private String requirementName;
    private String date;
    private String planFrom;
    private String planTo;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String taskType, String requirementName, String date,
            String planFrom, String planTo, String assingee, String reviewer) {
        this.id = id;
        this.taskType = taskType;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(String planFrom) {
        this.planFrom = planFrom;
    }

    public String getPlanTo() {
        return planTo;
    }

    public void setPlanTo(String planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return String.format(DISPLAY_FORMAT_HEADER, id, taskType, requirementName, date,
                Double.parseDouble(planTo) - Double.parseDouble(planFrom), assignee, reviewer);
    }

}
