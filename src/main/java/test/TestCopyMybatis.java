package test;

import com.mybatis.copy.MyApplicationAware;
import config.CopyMybatisBeenDifine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

/**
 * Created by dell on 2018/12/24.
 */
public class TestCopyMybatis {

	public static void main(String[] args){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CopyMybatisBeenDifine.class);
		applicationContext.getBean(UserService.class);
		applicationContext.getBean(MyApplicationAware.class).display();
//		applicationContext.getBean(UserService.class).test();
//		applicationContext.getBean(UserService.class).test();
	}

}
