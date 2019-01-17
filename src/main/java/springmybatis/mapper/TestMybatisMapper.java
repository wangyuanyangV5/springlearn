package springmybatis.mapper;

import java.util.List;
import springmybatis.model.TestMybatis;

public interface TestMybatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestMybatis record);

    TestMybatis selectByPrimaryKey(Integer id);

    List<TestMybatis> selectAll();

    int updateByPrimaryKey(TestMybatis record);
}