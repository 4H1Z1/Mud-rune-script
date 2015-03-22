package me.johngreen.com;

import me.johngreen.com.task.InventoryChecker;
import me.johngreen.com.task.Task;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import java.util.ArrayList;
import java.util.List;

@Script.Manifest(name="Muddy Runes", description="Dynamic mud rune crafter", properties = "client=6")

public class Main extends PollingScript<ClientContext>{

    private List<Task> taskList = new ArrayList<Task>();

    @Override
    public void start() {
        taskList.add(new InventoryChecker(ctx));
    }

    @Override
    public void poll() {
        for(Task task: taskList){
            if(task.activate()){

            }
        }
    }


}
