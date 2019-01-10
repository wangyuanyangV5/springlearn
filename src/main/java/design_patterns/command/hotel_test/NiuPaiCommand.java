package design_patterns.command.hotel_test;

/**
 * Created by dell on 2019/1/2.
 */
public class NiuPaiCommand implements CommandCook {

	Cooker cooker;

	public void setCooker(Cooker cooker){
		this.cooker = cooker;
	}

	@Override
	public void orderUp() {
		cooker.niuPai();
	}
}
