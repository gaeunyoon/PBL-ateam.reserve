package com.example.reserve;

public class Statistic{
    String userID;
    String menuID;
    String menuName;
    String menuAmount;

    //getter,setter 생성
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuAmount() {
        return menuAmount;
    }

    public void setMenuAmount(String menuAmount) {
        this.menuAmount = menuAmount;
    }


    //생성자 생성
    public Statistic(String menuID, String userID, String menuName,String menuAmount) {
        this.userID = userID;
        this.menuID = menuID;
        this.menuName = menuName;
        this.menuAmount = menuAmount;

    }
}
