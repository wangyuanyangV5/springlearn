package com.mybatis.copy;

import com.mybatis.mapper.UsersMapper;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by dell on 2018/12/24.
 */
public class WangScannerRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UsersMapper.class);

		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		beanDefinition.setBeanClass(WangMapperFactoryBean.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.mybatis1.mapper.UsersMapper");

		registry.registerBeanDefinition("usersMapper",beanDefinition);
	}
}
