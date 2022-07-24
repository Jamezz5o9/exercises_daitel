package Chapter8;

import java.text.SimpleDateFormat;

public class Time {
    //private final SimpleDateFormat format = new SimpleDateFormat();
    private int hour;
    private int minute;
    private int seconds;
    public void setTime(int hour, int minute, int seconds){
        if(hour < 0 || hour >= 24  || minute < 0 || minute >= 60 || seconds < 0 || 60 >= seconds){
            throw new IllegalArgumentException("The hour, minute and seconds was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public String toUniversalString(){
        return String.format("%02d%02d%02d", hour, minute, seconds );
    }
    public String toString(){
        return String.format("%02d:%02d:%02d %s", ((hour == 0 || hour < 12) ? 12 : hour % 12), minute, seconds, (hour > 12 ? "PM" : "AM" ));
    }
}
