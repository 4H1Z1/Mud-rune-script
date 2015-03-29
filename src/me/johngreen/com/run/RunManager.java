package me.johngreen.com.run;

import me.johngreen.com.Main;
import me.johngreen.com.task.Task;
import org.powerbot.script.rt6.ClientContext;

import java.util.ArrayList;

public class RunManager {
    private RunType runType;
    private ArrayList<RunTask> tasks;
    private ClientContext ctx;
    private Main main;
    private int current;

    public RunManager(RunType runType,ClientContext ctx,Main main){
        this.runType = runType;
        this.tasks = new ArrayList<RunTask>();
        this.ctx = ctx;
        this.main = main;
        this.current = 0;
        constructRun();
    }
    private void constructRun(){
        if(RunType.BasicRun == runType){
            tasks.add(new CastleWarsRun(ctx,main));
        }else if(RunType.TravelToBank == runType){

        }else if(RunType.SetupEquipment == runType){
            tasks.add(new SetupEquipment(ctx,main));
        }else if(RunType.Idle == runType){
            tasks.add(new Idle(ctx,main));
        }
    }
    public boolean isDone(){
        for(RunTask r:tasks){
            if(!r.isDone()){
                return false;
            }
        }
        return true;
    }
    public RunTask getTask() {
        for(RunTask r:tasks){
            if(!r.isDone()){
                return r;
            }
        }
        return null;
    }
}