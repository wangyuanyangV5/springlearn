package springmybatis.mapper;

import java.util.List;
import springmybatis.model.Country;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}