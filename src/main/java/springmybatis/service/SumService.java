package springmybatis.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springmybatis.mapper.CityMapper;
import springmybatis.mapper.UsersMapper;

/**
 * Created by dell on 2019/1/17.
 */
@Service
public class SumService {

    private static Logger log = LoggerFactory.getLogger(SumService.class);

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private UsersMapper usersMapper;


    public void test(){
        log.info(cityMapper.selectAll().toString());
        testTransactional();
    }

    @Transactional
    public void testTransactional(){
        log.info(usersMapper.selectAll().toString());
        log.info(usersMapper.selectAll().toString());
    }

}
