package design_patterns.command;

import design_patterns.command.com.Command;

/**
 * Created by dell on 2019/1/2.
 */
public class SimpleRemoteControl {
	Command slot;
	public SimpleRemoteControl(){

	}

	public void setCommand(Command command){
		this.slot = command;
	}


	public void buttonPressed(){
		slot.execute();
	}
}
