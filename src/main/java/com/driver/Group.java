package com.driver;

public class Group {
    private String name;
    private int numberOfParticipants;


    public Group(String Name,int NumberOfParticipants){
        this.name=Name;
        this.numberOfParticipants=NumberOfParticipants;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public String getName() {
        return name;
    }

}
