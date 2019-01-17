package springmybatis.mapper;

import java.util.List;
import springmybatis.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    City selectByPrimaryKey(Long id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}