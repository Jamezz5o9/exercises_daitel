package Chapter16;


import Chapter8.Time2;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {

    @Override
    public int compare(Time2 time1, Time2 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if(hourDifference != 0)return hourDifference;

        int minuteDifference = time1.getMinutes() - time2.getMinutes();
        if(minuteDifference != 0) return minuteDifference;
        int secondDiffernce = time1.getSeconds() - time2.getSeconds();
        return  secondDiffernce;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
