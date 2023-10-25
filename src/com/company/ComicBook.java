package com.company;

import java.sql.SQLOutput;

public class ComicBook extends Book{
    private String characterName;

    @Override
    public double getPrice() {
        System.out.println(getTitle()+("is on sale 70%"));
        double originalPrice=super.getPrice();
        return originalPrice*07;
    }
}
