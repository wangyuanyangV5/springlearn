package springmybatis.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import springmybatis.myenum.StateEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by dell on 2019/1/17.
 */
public class EnumTypeHandler extends BaseTypeHandler<StateEnum> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, StateEnum parameter, JdbcType jdbcType) throws SQLException {
            ps.setString(i,parameter.getDes());
    }

    @Override
    public StateEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return StateEnum.getByDes(rs.getString(columnName));
    }

    @Override
    public StateEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return StateEnum.getByDes(rs.getString(columnIndex));
    }

    @Override
    public StateEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return StateEnum.getByDes(cs.getString(columnIndex));
    }
}
