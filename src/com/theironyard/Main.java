package com.theironyard;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        //make a frame and a button
        //pass the button constructor the text you want on the button

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //makes the program quit when you close the window

        frame.getContentPane().add(button);
        //add the button to the frame's content pane

        frame.setSize(300,300);
        //give the frame a size in pixels

        frame.setVisible(true);
        //make it visible
    }
}
