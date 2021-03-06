package com.example.gogoroutine.others;

public class RoutineDO {

    private int routineNum;
    private String name;
    private int isAlamEnable;
    private int startHour;
    private int startMinute;
    private String selectedWeeks;
    private int alameMode;
    private int isSound;
    private int isVibration;


    public int getRoutineNum(){return this.routineNum;}
    public String getName(){return this.name;}
    public int getIsAlamEnable(){return this.isAlamEnable;}
    public int getStartHour(){return this.startHour;}
    public int getStartMinute(){return this.startMinute;}
    public String getSelectedWeeks(){return this.selectedWeeks;}
    public int getAlameMode(){return this.alameMode;}
    public int getIsSound(){return this.isSound;}
    public int getIsVibration(){return this.isVibration;}


    public void setRoutineNum(int routineNum){this.routineNum = routineNum;}
    public void setName(String name){this.name = name;}
    public void setIsAlamEnable(int isAlamEnable){this.isAlamEnable = isAlamEnable;}
    public void setStartHour(int startHour){this.startHour = startHour;}
    public void setStartMinute(int startMinute){this.startMinute = startMinute;}
    public void setSelectedWeeks(String selectedWeeks){this.selectedWeeks = selectedWeeks;}
    public void setAlameMode(int alameMode){this.alameMode = alameMode;}
    public void setIsSound(int isSound){this.isSound = isSound;}
    public void setIsVibration(int isVibration){this.isVibration = isVibration;}

    
    public RoutineDO( String name, int isAlamEnable, int startHour, int startMinute, String selectedWeeks, int alameMode,int isSound, int isVibration){
        this.name = name;
        this.isAlamEnable = isAlamEnable;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.selectedWeeks = selectedWeeks;
        this.alameMode = alameMode;
        this.isSound = isSound;
        this.isVibration = isVibration;
    }
    
    public RoutineDO(int routineNum, String name, int isAlamEnable, int startHour, int startMinute, String selectedWeeks, int alameMode,int isSound, int isVibration){
        this.routineNum = routineNum;
        this.name = name;
        this.isAlamEnable = isAlamEnable;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.selectedWeeks = selectedWeeks;
        this.alameMode = alameMode;
        this.isSound = isSound;
        this.isVibration = isVibration;
    }
    
    
    
}
