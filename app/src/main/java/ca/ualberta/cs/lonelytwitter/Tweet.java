package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by wattsl
 */

public abstract class Tweet{
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
    }
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }
    public String getMessage(){return message;}
    public Date getDate(){return date;}
    public abstract Boolean isImportant();
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    public void setDate(Date date){
        this.date = date;
    }

    ArrayList<Mood> moods;

    public ArrayList<Mood> getMoods() {
        return moods;
    }
    public void addMoods(Mood mood){
        moods.add(mood);
    }
}