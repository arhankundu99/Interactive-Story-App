package com.treehouse.mystoryapp;

public class Story {
    private Page[] pages;
    private Choice choice1,choice2;
    public Story(){

        pages=new Page[7];

        choice1=new Choice(R.string.page0_choice1,1);
        choice2=new Choice(R.string.page0_choice2,2);
        pages[0]=new Page(R.drawable.page0,R.string.page0,choice1,choice2);

        choice1=new Choice(R.string.page1_choice1,3);
        choice2=new Choice(R.string.page1_choice2,4);
        pages[1]=new Page(R.drawable.page1,R.string.page1,choice1,choice2);

        choice1=new Choice(R.string.page2_choice1,4);
        choice2=new Choice(R.string.page2_choice2,6);
        pages[2]=new Page(R.drawable.page2,R.string.page2,choice1,choice2);

        choice1=new Choice(R.string.page3_choice1,4);
        choice2=new Choice(R.string.page3_choice2,5);
        pages[3]=new Page(R.drawable.page3,R.string.page3,choice1,choice2);

        choice1=new Choice(R.string.page4_choice1,5);
        choice2=new Choice(R.string.page4_choice2,6);
        pages[4]=new Page(R.drawable.page4,R.string.page4,choice1,choice2);

        pages[5]=new Page(R.drawable.page5,R.string.page5);

        pages[6]=new Page(R.drawable.page6,R.string.page6);
    }
    public Page getPage(int pageNumber)
    {
        return pages[pageNumber];
    }
}
