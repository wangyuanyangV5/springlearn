package com.mybatis.copy;

import org.apache.ibatis.annotations.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dell on 2018/12/24.
 */
public class WangInvocationHandler implements InvocationHandler {


	private Logger log = LoggerFactory.getLogger(WangInvocationHandler.class);

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
  		String sql =  method.getDeclaredAnnotation(Select.class).value()[0];

  		log.error("-------------------------SQL:" + sql  + "------------------------------------------");

		return null;
	}
}
