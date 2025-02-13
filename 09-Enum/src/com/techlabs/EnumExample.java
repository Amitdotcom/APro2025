package com.techlabs;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        
        
        
        Day day3 = Day.MONDAY;

        
        System.out.println("Today is: " + today);


        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            case SUNDAY:
                System.out.println("It's a holiday!");
                break;
            default:
                System.out.println("It's a regular day.");
        }
    }
}
