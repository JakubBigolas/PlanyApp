package com.byd.wsg.com.wsg.byd.plan;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Jakub on 2016-06-09.
 */
public class News {

    TimeTable timeTable;

    public News(TimeTable timeTable, PeriodOfTime thisDay, PeriodOfTime thisWeek, PeriodOfTime thisMonth) {
        this.timeTable = timeTable;
        this.thisDay = thisDay;
        this.thisWeek = thisWeek;
        this.thisMonth = thisMonth;
    }

    public News() {
    }


    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    public static class PeriodOfTime{
        private int
                currentCountOfLessons,
                countOfLessons,
                currentCountOfEnvents,
                countOfEvents;

        Calendar startTime, endTime;

        public Calendar getStartTime() {
            return startTime;
        }

        public void setStartTime(Calendar startTime) {
            this.startTime = startTime;
        }

        public Calendar getEndTime() {
            return endTime;
        }

        public void setEndTime(Calendar endTime) {
            this.endTime = endTime;
        }

        private ArrayList<Event> events;

        public ArrayList<Event> getEvents() {
            return events;
        }

        public int getCurrentCountOfEnvents() {
            return currentCountOfEnvents;
        }

        public void setCurrentCountOfEnvents(int currentCountOfEnvents) {
            this.currentCountOfEnvents = currentCountOfEnvents;
        }

        public int getCountOfEvents() {
            return countOfEvents;
        }

        public void setCountOfEvents(int countOfEvents) {
            this.countOfEvents = countOfEvents;
        }

        public void setEvents(ArrayList<Event> events) {
            this.events = events;
        }

        public int getCurrentCountOfLessons() {
            return currentCountOfLessons;
        }

        public void setCurrentCountOfLessons(int currentCountOfLessons) {
            this.currentCountOfLessons = currentCountOfLessons;
        }

        public int getCountOfLessons() {
            return countOfLessons;
        }

        public void setCountOfLessons(int countOfLessons) {
            this.countOfLessons = countOfLessons;
        }
    };

    private PeriodOfTime
            thisDay,
            thisWeek,
            thisMonth;

    public PeriodOfTime getThisDay() {
        return thisDay;
    }

    public void setThisDay(PeriodOfTime thisDay) {
        this.thisDay = thisDay;
    }

    public PeriodOfTime getThisWeek() {
        return thisWeek;
    }

    public void setThisWeek(PeriodOfTime thisWeek) {
        this.thisWeek = thisWeek;
    }

    public PeriodOfTime getThisMonth() {
        return thisMonth;
    }

    public void setThisMonth(PeriodOfTime thisMonth) {
        this.thisMonth = thisMonth;
    }
}
