package design_patterns.command.garagedoor;

/**
 * Created by dell on 2019/1/2.
 */
public class GarageDoor {

	public void up(){
		System.out.println("GarageDoor on");
	}

	public void down(){
		System.out.println("GarageDoor down");
	}

	public void stop(){
		System.out.println("GarageDoor stop");
	}

	public void lightOn(){
		System.out.println("GarageDoor lightOn");
	}

	public void lightOff(){
		System.out.println("GarageDoor lightOff");
	}

}
