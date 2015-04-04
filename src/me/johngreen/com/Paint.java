package me.johngreen.com;

import java.awt.*;

import org.powerbot.bot.rt6.client.input.Mouse;
import org.powerbot.script.PaintListener;
import org.powerbot.script.rt6.Equipment;


public class Paint implements PaintListener {
    private static final Color fontColor = Color.WHITE;
    private static final Color rectColor = new Color(255, 0, 0, 100);
    private static final Font font = new Font("Verdana", 0, 12);
    private String message;
    private Main main;

    public Paint(Main main){
        this.main = main;
        this.message = "Booting up!";
    }

    public void repaint(Graphics g) {


        g.setColor(Color.lightGray);
        g.fillRect(10, 10, 300, 110);

        g.setColor(Color.GRAY);
        g.fillRect(15, 25, 290, 80);
        g.drawString("Muddy Runes", 10, 22);
        g.drawString("By:John Green", 10, 117);

        g.setColor(Color.LIGHT_GRAY);
        g.drawString("Time Running:" + main.getMath().getTime(), 15, 35);
        g.drawString("Status:" + message, 15, 45);
        g.drawString("Run Count:"+main.getMath().getRunCount(), 15, 55);
        g.drawString("Mud Rune Count:"+main.getMath().getCollectedRuneCount(), 15, 65);
        g.drawString("Overall Profit:" + (main.getMath().getMudRunePrice() * main.getMath().getCollectedRuneCount()), 15, 75);


        Point point = main.getCTX().mouse.getLocation();
        g.setColor(Color.CYAN);
        g.drawLine(point.x - 7, point.y, point.x + 7, point.y);
        g.drawLine(point.x, point.y - 7, point.x, point.y + 7);
    }

    public void setStatusMessage(String message){
        this.message = message;
    }


}