package design_patterns.command.hotel_test;

import java.util.List;

/**
 * Created by dell on 2019/1/2.
 */
public class Waiter {

	private List<CommandCook> commandCooks;


	public void setCommandCooks(List<CommandCook> commandCooks){
		this.commandCooks = commandCooks;
	}

	public void takeOrder(){
		commandCooks.forEach(commandCook -> commandCook.orderUp());
	}

}
