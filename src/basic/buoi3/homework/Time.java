package basic.buoi3.homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // method
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,this.hour);
        cal.set(Calendar.MINUTE, this.minute);
        cal.set(Calendar.SECOND, this.second);

        Date date = cal.getTime();
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }

    public Time nextSecond(){
        return new Time(this.hour, this.minute, this.second+1);
    }
    public Time previousSecond(){
        return new Time(this.hour, this.minute, this.second-1);
    }

    // main method
    public static void main(String[] args) {
        System.out.println(new Time(23, 2, 3).toString());
        System.out.println(new Time(23, 2, 3).nextSecond().toString());
        System.out.println(new Time(23, 2, 3).previousSecond().toString());
    }

}
