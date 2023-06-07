package com.course.udemy;

public class SuperContraGame implements gammingconsole{
    //loosely coupling with using interface
    @Override
    public void up() {
        System.out.println("flying");
    }

    @Override
    public void down() {
        System.out.println("deeb swimming");
    }

    @Override
    public void right() {
        System.out.println("going right");
    }

    @Override
    public void left() {
        System.out.println("going left");
    }
}
