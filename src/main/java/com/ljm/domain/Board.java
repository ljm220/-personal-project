package com.ljm.domain;

import java.util.Date;

public class Board {
    private int noticeNum;
    private String noticeTitle;
    private String noticeContext;
    private String noticeWriter;
    private Date noticeDate;
    private int noticeCheck;
    private int noticeLike;
    private String formattedNoticeDate;

    public int getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(int noticeNum) {
        this.noticeNum = noticeNum;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContext() {
        return noticeContext;
    }

    public void setNoticeContext(String noticeContext) {
        this.noticeContext = noticeContext;
    }

    public String getNoticeWriter() {
        return noticeWriter;
    }

    public void setNoticeWriter(String noticeWriter) {
        this.noticeWriter = noticeWriter;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public int getNoticeCheck() {
        return noticeCheck;
    }

    public void setNoticeCheck(int noticeCheck) {
        this.noticeCheck = noticeCheck;
    }

    public int getNoticeLike() {
        return noticeLike;
    }

    public void setNoticeLike(int noticeLike) {
        this.noticeLike = noticeLike;
    }

    public String getFormattedNoticeDate() {
        return formattedNoticeDate;
    }

    public void setFormattedNoticeDate(String formattedNoticeDate) {
        this.formattedNoticeDate = formattedNoticeDate;
    }
    
    

}
