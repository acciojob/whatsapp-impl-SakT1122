package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;


    public Message(int id,String Content){
        this.id=id;
        this.content=Content;
        //this.timestamp=timestamp;
    }

}
