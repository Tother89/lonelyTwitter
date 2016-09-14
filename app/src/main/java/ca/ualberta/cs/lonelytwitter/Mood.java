package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tothd on 9/13/2016.
 */
public abstract class Mood {
    private Date date;
    String mood;

    public Mood(Date date){
        this.date = date;

    }
    public void setDate(Date date){this.date=date;}

    public Date getDate(){return this.date;}

    public abstract String moodDescription();
}
