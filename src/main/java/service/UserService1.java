package service;

import com.mybatis.mapper.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2018/12/23.
 */
@Service
public class UserService1 {

	@Autowired
	private UsersMapper usersMapper;

	private Logger log = LoggerFactory.getLogger(UserService1.class);

	public void test(){
		log.error(  usersMapper.select("1") + "-----------");
	}

}
