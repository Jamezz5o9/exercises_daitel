package Chapter8;

public class Time2 {

    private int hour;
    private int seconds;
    private int minutes;

    public Time2(){
        this(0, 0, 0);
    }

    public Time2(int hour){
        this(hour, 0, 0);
    }

    public Time2(int hour, int minutes){
        this(hour, minutes, 0);
    }

    public Time2(int hour, int minutes, int seconds){
        if(hour > 24 || hour < 0){
            throw new IllegalArgumentException("hour must be between 0 - 23");
        }
        if(minutes < 0 || minutes > 60){
            throw new IllegalArgumentException("minutes must be between 0 - 59");
        }
        if(seconds < 0 || seconds > 60){
            throw new IllegalArgumentException("seconds must be between 0 - 59");
        }

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time2(Time2 time){
        this(time.hour, time.minutes, time.seconds);
    }

        public void setTime(int hour, int minutes, int seconds){
            if(hour > 24 || hour < 0){
                throw new IllegalArgumentException("hour must be between 0 - 23");
            }
            if(minutes < 0 || minutes > 60){
                throw new IllegalArgumentException("minutes must be between 0 - 59");
            }
            if(seconds < 0 || seconds > 60){
                throw new IllegalArgumentException("seconds must be between 0 - 59");
            }
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public void setHour(int hour){
            if(hour > 24 || hour < 0){
                throw new IllegalArgumentException("hour must be between 0 - 23");
            }
            this.hour = hour;
        }

        public void setMinutes(int minutes){
            if(minutes < 0 || minutes > 60){
                throw new IllegalArgumentException("minutes must be between 0 - 59");
            }
        this.minutes = minutes;
        }

        public void setSeconds(int seconds){
        if(seconds < 0 || seconds > 60){
            throw new IllegalArgumentException("seconds must be between 0 - 59");
        }

        this.seconds = seconds;
        }

        public int getHour(){
        return hour;
        }

        public int getMinutes(){
        return minutes;
        }

        public int getSeconds(){
        return seconds;
        }

        public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
        }

        public String toString(){
        return String.format("%d:%02d:%02d %s", (getHour() == 0 || getHour() == 12 ? 12 : getHour() % 12), getMinutes(), getSeconds(), (getHour() < 12 ? "AM" : "PM"));
        }
}
