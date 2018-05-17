package com.example.act.a448856;

import java.util.Observable;

public class CountryModel extends Observable{

    private String name;
    private int orders;
    private int colorR1;
    private int colorG1;
    private int colorB1;
    private int colorR2;
    private int colorG2;
    private int colorB2;
    private int colorR3;
    private int colorG3;
    private int colorB3;


    public CountryModel(String name, int orders, int colorR1, int colorG1, int colorB1, int colorR2, int colorG2, int colorB2, int colorR3, int colorG3, int colorB3) {
        this.name = name;
        this.orders = orders;
        this.colorR1 = colorR1;
        this.colorG1 = colorG1;
        this.colorB1 = colorB1;
        this.colorR2 = colorR2;
        this.colorG2 = colorG2;
        this.colorB2 = colorB2;
        this.colorR3 = colorR3;
        this.colorG3 = colorG3;
        this.colorB3 = colorB3;
    }

    public String getName() {
        return name;
    }

    public int getOrders() {
        return orders;
    }

    public int getColorR1() {
        return colorR1;
    }

    public int getColorG1() {
        return colorG1;
    }

    public int getColorB1() {
        return colorB1;
    }

    public int getColorR2() {
        return colorR2;
    }

    public int getColorG2() {
        return colorG2;
    }

    public int getColorB2() {
        return colorB2;
    }

    public int getColorR3() {
        return colorR3;
    }

    public int getColorG3() {
        return colorG3;
    }

    public int getColorB3() {
        return colorB3;
    }

    public void incrementNumber() {
        orders = orders + 1;
        setChanged();
        notifyObservers();
    }

    public void decrementNumber() {
        orders = orders - 1;
        setChanged();
        notifyObservers();
    }

    public void setName(String name) {
        if (this.name != name) {
            this.name = name;
            setChanged();
            notifyObservers();
        }
    }

    public void setOrders(int orders) {
        if (this.orders != orders) {
            this.orders = orders;
            setChanged();
            notifyObservers();
        }
    }

    public void setColorR1(int colorR1) {
        this.colorR1 = colorR1;
        setChanged();
        notifyObservers();
    }

    public void setColorG1(int colorG1) {
        this.colorG1 = colorG1;
        setChanged();
        notifyObservers();
    }

    public void setColorB1(int colorB1) {
        this.colorB1 = colorB1;
        setChanged();
        notifyObservers();
    }

    public void setColorR2(int colorR2) {
        this.colorR2 = colorR2;
        setChanged();
        notifyObservers();
    }

    public void setColorG2(int colorG2) {
        this.colorG2 = colorG2;
        setChanged();
        notifyObservers();
    }

    public void setColorB2(int colorB2) {
        this.colorB2 = colorB2;
        setChanged();
        notifyObservers();
    }

    public void setColorR3(int colorR3) {
        this.colorR3 = colorR3;
        setChanged();
        notifyObservers();
    }

    public void setColorG3(int colorG3) {
        this.colorG3 = colorG3;
        setChanged();
        notifyObservers();
    }

    public void setColorB3(int colorB3) {
        this.colorB3 = colorB3;
        setChanged();
        notifyObservers();
    }
}
