package me.johngreen.com.run;

import me.johngreen.com.Main;
import me.johngreen.com.task.Task;
import org.powerbot.script.rt6.ClientContext;

public abstract class RunTask extends Task{
    private boolean isDone;
    public ClientContext ctx;
    public Main main;
    public RunTask(ClientContext ctx, Main main){
        super(ctx,main);
        isDone = false;
        this.ctx = ctx;
        this.main = main;
    }
    public boolean isDone(){
        return isDone;
    }
    public void stop(){
        isDone=true;
    }
}
