package mybatis.xml;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2019/1/10.
 */
@Data
public class TestXml {

	private   final String nameSpace;

	private   final Map<String,String> methodSql = new HashMap<>();

	public TestXml(String nameSpace){
		this.nameSpace = nameSpace;
		methodSql.put("selectNameById","select name from test_mybatis where id = %s");
	}

	public String getNameSpace(){
		return nameSpace;
	}

	public String getSql(String methodName){
		return methodSql.get(methodName);
	}

	public String addMethod(String methodName,String sql){
		return methodSql.put(methodName,sql);
	}

}
