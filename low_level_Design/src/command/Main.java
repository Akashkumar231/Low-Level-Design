package command;

import java.rmi.Remote;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

class RemoteController{
    List<ICommand> commandList;
    RemoteController(){
        this.commandList = new ArrayList<>();
    }
    RemoteController(List<ICommand> commandList){
     this.commandList = commandList;
    }

    public void setCommand(ICommand command){
        commandList.add(command);
    }

    public void removeCommand(ICommand command){
        commandList.remove(command);
    }

    public void pressButton(int buttonIndex, boolean value){
        if (buttonIndex > commandList.size()){
            System.out.println("No Command is set for this button");
            return;
        }
        if (value){
            commandList.get(buttonIndex).execute();
        }else{
            commandList.get(buttonIndex).undo();
        }

    }
}

interface ICommand{
    void execute();
    void undo();
}

class FanCommand implements ICommand{
    Fan fan;
    FanCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
      fan.off();
    }
}

 class LightCommand implements ICommand{
    Light light;

    LightCommand(Light light){
        this.light = light;
    }
     @Override
     public void execute() {
         light.off();
     }
     @Override
     public void undo() {
         light.on();
     }
 }

 class Light {

     public void on(){
        System.out.println("Light are turned on.");
    }

    public void off(){
        System.out.println("Light are turned off.");
    }

 }

 class Fan{
    public  void on(){
        System.out.println("Fan is turned ON.");
    }
    public void off(){
        System.out.println("Fan is turned OFF");
    }
 }


public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightCommand light = new LightCommand(new Light());
        remoteController.setCommand(light);
        FanCommand fan  = new FanCommand(new Fan());
        remoteController.setCommand(fan);
        remoteController.pressButton(1,true);
        remoteController.pressButton(1,false);
    }
}
