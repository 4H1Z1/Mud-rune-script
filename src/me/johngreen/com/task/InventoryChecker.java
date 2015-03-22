package me.johngreen.com.task;

import org.powerbot.script.rt6.ClientContext;

public class InventoryChecker extends Task<ClientContext>{

    public InventoryChecker(ClientContext ctx){
        super(ctx);
    }

    @Override
    public boolean activate() {
        return ctx.backpack.select().count()<28;
    }

    @Override
    public void execute() {

    }
}
