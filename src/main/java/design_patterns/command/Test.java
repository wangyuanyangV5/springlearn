package design_patterns.command;

import design_patterns.command.com.GarageDoorOpenCommand;
import design_patterns.command.com.LightOnCommand;
import design_patterns.command.garagedoor.GarageDoor;
import design_patterns.command.light.Light;

/**
 * Created by dell on 2019/1/2.
 */
public class Test {

	public static void main(String[] args){
		SimpleRemoteControl control = new SimpleRemoteControl();

		Light light = new Light();

		LightOnCommand lightOnCommand = new LightOnCommand(light);

		control.setCommand(lightOnCommand);

		control.buttonPressed();

		GarageDoor garageDoor = new GarageDoor();

		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

		control.setCommand(garageDoorOpenCommand);

		control.buttonPressed();

	}

}
