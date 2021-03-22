package com.jkelly.tickets.ticketsshop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Date date;

    public Event(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        date = Calendar.getInstance().getTime();
        return date;
    }

    public void setDate(Date date) { this.date = date; }

    public Event() {}
}
