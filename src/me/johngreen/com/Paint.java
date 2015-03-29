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
        g.setColor(rectColor);
        g.fillRect(20, 20, 240, 124);
        g.setFont(font);
        g.setColor(fontColor);

        g.drawString("Muddy Runes", 24, 34);

        g.drawString("Status:"+message,24,34+(1*font.getSize()));

        g.drawString("Time Running:"+main.getMath().getTime(),24,34+(2*font.getSize()));

        g.drawString("Run Count:"+main.getMath().getRunCount(),24,34+(3*font.getSize()));

        g.drawString("Rune Count:"+main.getMath().getCollectedRuneCount(),24,34+(4*font.getSize()));

        g.drawString("Overall Profit:"+(main.getMath().getMudRunePrice()*main.getMath().getCollectedRuneCount()),24,34+(5*font.getSize()));

        Point point = main.getCTX().mouse.getLocation();
        g.drawLine(point.x-7,point.y,point.x+7,point.y);
        g.drawLine(point.x,point.y-7,point.x,point.y+7);
    }

    public void setStatusMessage(String message){
        this.message = message;
    }


}