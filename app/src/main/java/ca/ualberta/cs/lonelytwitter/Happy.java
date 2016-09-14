package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tothd on 9/13/2016.
 */
public class Happy extends Mood {

    public Happy(Date date){
        super(date);
    }

    public String moodDescription(){
        return "Happy";
    }


}
