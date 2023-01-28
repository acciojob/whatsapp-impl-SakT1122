package com.driver;

public class Group {
    private String name;
    private int numberOfParticipants;


    public Group(String Name,int NumberOfParticipants){
        this.name=Name;
        this.numberOfParticipants=NumberOfParticipants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public String getName() {
        return name;
    }

}
