package design_patterns.command.com;

import design_patterns.command.com.Command;
import design_patterns.command.light.Light;

/**
 * Created by dell on 2019/1/2.
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
}
