package com.treehouse.mystoryapp;



public class Choice {

    private int choiceTextId;
    private int nextPage;

    public Choice(int choiceTextId,int nextPage)
    {
        this.choiceTextId=choiceTextId;
        this.nextPage=nextPage;
    }
    public int getChoiceTextId()
    {
        return choiceTextId;
    }
    public int getNextPage()
    {
        return nextPage;
    }
}
