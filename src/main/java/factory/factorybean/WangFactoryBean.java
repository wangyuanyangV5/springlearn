package factory.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2018/12/23.
 */
@Component
public class WangFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new WangBean();
	}

	@Override
	public Class<?> getObjectType() {
		return WangBean.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
