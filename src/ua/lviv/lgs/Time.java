package ua.lviv.lgs;

public class Time {
    private  int minute;
    private  int hour;

    public Time(int minute, int hour) {
        this.minute = minute;
        this.hour = hour;
    }
public  Time add(Time other) {
    int minSum = 0;
    int hourSum = 0;
    int newMinute = (minute + other.minute);
    int newHour = (hour + other.hour);
    minSum=newMinute;
    if (minSum > 59) {
        hourSum += 1;
        minSum %= 60;
    }
    hourSum = hourSum + newHour;
    System.out.println(hourSum+" Hours : "+minSum+" minutes");
    return other;
}

//    public static void main(String[] args) {
//        add(new Time(12,2));
//    }
//    public Time add(Time other) {
//        int newMinute = (minute + other.minute) % 60;
//        int newHour = (hour + other.hour) % 24;
//        //int newTime = newHour + newMinute;
//        return new Time(newMinute, newHour);
//    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minutes should be between 0 and 60");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour should be between 0 and 24");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "minute=" + minute +
                ", hour=" + hour +
                '}';
    }
}
