package service;

import com.mybatis.mapper.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by dell on 2018/12/23.
 */
@Service
public class UserService {

//	@Autowired
//	private UsersMapper usersMapper;

	private String name;
	private int age;

	private Logger log = LoggerFactory.getLogger(UserService.class);
	@PostConstruct
	public void init(){
		log.error("-------------init-------------");
	}

//	public void test(){
//		log.error( "----------------------result:" + usersMapper.selectAll() + "-----------");
//	}

}
