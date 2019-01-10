package design_patterns.command.com;

import design_patterns.command.garagedoor.GarageDoor;

/**
 * Created by dell on 2019/1/2.
 */
public class GarageDoorOpenCommand implements Command
{

	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
			garageDoor.lightOn();
			garageDoor.up();
	}



}
