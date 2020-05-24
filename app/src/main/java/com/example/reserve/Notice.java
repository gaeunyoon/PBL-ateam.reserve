package com.example.reserve;

public class Notice {
    //공지사항 내용,이름,날짜
    String notice;
    String name;
    String date;

    //생성자 생성
    public Notice(String notice, String name, String date) {
        this.notice = notice;
        this.name = name;
        this.date = date;
    }

    //getter,setter 생성
    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
