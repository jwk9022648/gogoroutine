package com.example.gogoroutine.activity_routinemanager.AddTaskDialog;

public class TaskAddDialogAdapterDO {

    private int taskNum;
    private String name;
    private int hour;
    private int minute;
    private int second;
    private String emoji;
    private String summary;
    private int category;

    public int getTaskNum(){return this.taskNum;}
    public String getName(){return this.name;}
    public int getHour(){return this.hour;}
    public int getMinute(){return this.minute;}
    public int getSecond(){return this.second;}
    public String getEmoji(){return this.emoji;}
    public String getSummary(){return this.summary;}
    public int getCategory(){return this.category;}


    public void setTaskNum(int taskNum){this.taskNum = taskNum;}
    public void setName(String name){this.name = name;}
    public void setHour(int hour){this.hour = hour;}
    public void setMinute(int minute){this.minute = minute;}
    public void setSecond(int second){this.second = second;}
    public void setEmoji(String emoji){this.emoji = emoji;}
    public void setSummary(String summary){this.summary = summary;}
    public void setCategory(int category){this.category = category;}



}
