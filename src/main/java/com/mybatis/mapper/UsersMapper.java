package com.mybatis.mapper;

import com.mybatis.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;
public interface UsersMapper {
//    int deleteByPrimaryKey(Integer userId);
//
//    int insert(Users record);
//
//    Users selectByPrimaryKey(Integer userId);
//    @Select("select user_id, user_name as userName, brithday from users")
    List<Users> select(@Param("id") String id);

//    int updateByPrimaryKey(Users record);
}