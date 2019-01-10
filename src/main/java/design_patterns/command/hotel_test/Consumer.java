package design_patterns.command.hotel_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/1/2.
 */
public class Consumer {

	public static void main(String[] args){
		Cooker cooker = new Cooker();

		List<CommandCook> commandCooks = new ArrayList<>();
		DanChaoFanCommand danChaoFanCommand = new DanChaoFanCommand();
		danChaoFanCommand.setCooker(cooker);
		commandCooks.add(danChaoFanCommand);
		NiuPaiCommand niuPaiCommand = new NiuPaiCommand();
		niuPaiCommand.setCooker(cooker);
		commandCooks.add(niuPaiCommand);

		Waiter waiter = new Waiter();
		waiter.setCommandCooks(commandCooks);
		waiter.takeOrder();

	}

}
