package factory.factorybean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by dell on 2018/12/23.
 */
public class WangBean {
	private static Logger log = LoggerFactory.getLogger(WangBean.class);
	public WangBean(){
		log.error("========WangBean==================");
	}
}
