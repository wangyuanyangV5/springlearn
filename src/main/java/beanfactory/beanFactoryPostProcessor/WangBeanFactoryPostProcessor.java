package beanfactory.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import service.UserService;

/**
 * Created by dell on 2018/12/23.
 * BeanFactoryPostProcessor spring扩展点
 */
@Component
public class WangBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition userService1 = (GenericBeanDefinition) beanFactory.getBeanDefinition("beanTmp");
		userService1.setBeanClass(Bean.class);
	}
}
