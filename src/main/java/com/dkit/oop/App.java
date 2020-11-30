package com.dkit.oop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name: Samuel Olajide
 * Class Group: SD1a
 * Your GitHub link: https://github.com/samolajide23/oop-ca2
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());

        System.out.println("\n");
        System.out.println("Property p1 details with facility:");
        p1.addFacility("electricity");
        p1.addFacility("freehold");
        System.out.println(p1.toString());
        p1.removeFacility("electricity");
        System.out.println(p1.toString());


        Property p2 = new Property(2, "John Murry", "A91V9P2", 250000, 100);
        System.out.println(p2.equals(p1));

        System.out.println(p1.hashCode());
        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

