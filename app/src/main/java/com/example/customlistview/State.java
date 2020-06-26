package com.example.customlistview;

public class State {

    private String name; //название страны
    private String capital; //столица
    private int flagResource; //ресурс флага

    public State(String name, String capital, int flag){
        this.name=name;
        this.capital=capital;
        this.flagResource=flag;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getCapital(){
        return this.capital;
    }

    public void setCapital(String capital){
        this.capital=capital;
    }
    public int getFlagResource(){
        return this.flagResource;
    }

    public void setFlagResource(int cflagResource){
        this.flagResource=flagResource;
    }

}
