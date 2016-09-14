package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tothd on 9/13/2016.
 */
public class Sad extends Mood{
    public Sad(Date date){
        super(date);
    }

    public String moodDescription(){
        return "Sad";
    }
}
