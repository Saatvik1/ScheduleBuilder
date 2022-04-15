package com.company.ScheduleBuilder.Schedules.Events;

public class Event {
    private String name;
    private String[] timeStart = {"Days","Hour", "Minute", "AMPM"};
    private String description;
    private String tags;

    public Event (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String[] getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String[] timeStart) {
        this.timeStart = timeStart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
