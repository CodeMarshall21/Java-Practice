package com.A21_Enums;

public enum Days {
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);

    private final int day;

    Days(int day){
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }
}
