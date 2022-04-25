package org.vashonsd;
import java.time.LocalDateTime;
import java.time.format.*;


public class Holiday {
    int month;
    int day;
    String name;
    String description;
    boolean fedReq;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFedReq() {
        return fedReq;
    }

    public void setFedReq(Boolean fedReq) {
        this.fedReq = fedReq;
    }

    public Holiday(int month, int day, String name, String description, boolean fedReq) {
        this.month = month;
        this.day = day;
        this.name = name;
        this.description = description;
        this.fedReq = fedReq;
    }
    public static boolean isToday(int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd");
        LocalDateTime today = LocalDateTime.now();
        String formated = today.format(formatter);
        if(formated.substring(0, 3).equals(String.valueOf(month)) && formated.substring(3, 6).equals(String.valueOf(day))) {
            return true;
        }
        return false;
    }
}
