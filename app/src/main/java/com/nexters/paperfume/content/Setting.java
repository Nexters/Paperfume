package com.nexters.paperfume.content;

/**
 * Created by user on 2016-08-06.
 */

public class Setting {
    private static Setting ourInstance = new Setting();

    public static Setting getInstance() {
        return ourInstance;
    }

    private Setting() {

    }

    private String color;
    private String gender;
    private String blood;
    private int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void loadSetting(Setting setting) {
        this.gender = setting.getGender();
        this.blood = setting.getBlood();
        this.color = setting.getColor();
        this.age = setting.getAge();
    }

    public String getColorKor(){
        if(this.color.equals("black")){
            return "검정";
        }else if(this.color.equals("purple")){
            return "보라";
        }else if(this.color.equals("green")){
            return "초록";
        }else if(this.color.equals("sky")){
            return "하늘";
        }else if(this.color.equals("blue")){
            return "파랑";
        }else if(this.color.equals("yellow")){
            return "노랑";
        }else if(this.color.equals("red")){
            return "빨강";
        }else if(this.color.equals("pink")){
            return "분홍";
        }else if(this.color.equals("white")){
            return "하양";
        }else{
            return "무색";
        }
    }
}
