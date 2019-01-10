package factory.factorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by dell on 2018/12/29.
 */
@Controller
public class Contr {
	@Autowired
	private Service service;
}
