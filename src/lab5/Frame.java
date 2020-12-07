package lab5;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(String path)
    {
        ImageComp imageComp = new ImageComp(path);

        setTitle("Image in the window!!!");
        setSize(600, 640);
        add(imageComp);
    }
}