package edu.escuelaing.ieti.dto;
public class TaskDto {
    private String name;
    private String description;
    private String assignedTo;
    private String dueDate;
    enum Status{
        TODO, DOING, REVIEW, DONE
    }
    public TaskDto(String name, String description, String assignedTo, String dueDate) {
        this.name = name;
        this.description = description;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

}