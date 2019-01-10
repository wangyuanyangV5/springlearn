package com.mybatis.copy;

import factory.factorybean.WangFactoryBean;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * Created by dell on 2018/12/24.
 */
public class WangMapperFactoryBean implements FactoryBean {

	private Class mapperInterface;

	public WangMapperFactoryBean(Class mapperInterface){
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{mapperInterface},new WangInvocationHandler());
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
