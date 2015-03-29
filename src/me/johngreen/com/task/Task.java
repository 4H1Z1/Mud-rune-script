package me.johngreen.com.task;

import me.johngreen.com.Main;
import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;

public abstract class Task<C extends ClientContext> extends ClientAccessor<C> {
    private Main main;
    public Task(C ctx,Main main) {
        super(ctx);
        this.main = main;
    }
    public abstract boolean activate();
    public abstract void execute();
    public void tick(){

    }
}
