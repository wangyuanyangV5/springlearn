package springmybatis.mapper;

import java.util.List;
import springmybatis.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    Users selectByPrimaryKey(Integer userId);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}