package com.cloudbreaker.Models;


/**
 * Created by nickmattei on 10/30/15.
 */
public class Document {
    String name;
    String genre;
    String collectionName;
    String body;

    public Document(String name, String genre, String collectionName, String body){
        this.name = name;
        this.genre = genre;
        this.collectionName = collectionName;
        this.body = body;

    }

    public String getName(){
        return this.name;
    }

    public String getBody(){
        return this.body;
    }

}
